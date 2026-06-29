package com.iagomoreira.urbanflow.service.request;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.SecurityService;

@Service
public class RequestCommandService {

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RequestValidationService requestValidationService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	private Request fromDTO(CreateRequestDTO dto) {

		Request request = new Request();

		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());

		request.setCategoryId(dto.getCategoryId());
		request.setSubCategoryId(dto.getSubCategoryId());

		request.setCitizenPriority(dto.getCitizenPriority());

		request.setLatitude(dto.getLatitude());
		request.setLongitude(dto.getLongitude());

		if (dto.getAddress() != null) {

			Address address = new Address();

			address.setCep(dto.getAddress().getCep());
			address.setStreet(dto.getAddress().getStreet());
			address.setNumber(dto.getAddress().getNumber());
			address.setNeighborhood(dto.getAddress().getNeighborhood());
			address.setCity(dto.getAddress().getCity());
			address.setState(dto.getAddress().getState());
			address.setComplement(dto.getAddress().getComplement());

			request.setAddress(address);
		}

		return request;
	}

	public RequestResponseDTO create(CreateRequestDTO dto) {

		String authenticatedUserId = securityService.getAuthenticatedUserId();

		if (!userRepository.existsById(authenticatedUserId)) {
			throw new ResourceNotFoundException("Authenticated user not found");
		}

		SubCategory subCategory = subCategoryRepository.findById(dto.getSubCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));

		if (!subCategory.getCategoryId().equals(dto.getCategoryId())) {

			throw new BusinessException("SubCategory does not belong to the selected category");
		}

		Request request = fromDTO(dto);

		request.setUserId(securityService.getAuthenticatedUserId());
		request.setDepartmentId(subCategory.getDepartmentId());

		request.setCreatedAt(LocalDateTime.now());
		request.setUpdatedAt(LocalDateTime.now());

		request.setStatus(RequestStatus.RECEIVED);

		Request savedRequest = requestRepository.save(request);

		return new RequestResponseDTO(savedRequest);
	}

	public RequestResponseDTO update(String id, UpdateRequestDTO dto) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);

		if (request.getStatus() == RequestStatus.RESOLVED || request.getStatus() == RequestStatus.CANCELLED) {

			throw new BusinessException("Resolved or cancelled requests cannot be modified");
		}

		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());
		request.setUpdatedAt(LocalDateTime.now());

		request = requestRepository.save(request);

		return new RequestResponseDTO(request);
	}

	public void delete(String id) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);

		if (request.getStatus() == RequestStatus.RESOLVED) {

			throw new BusinessException("Resolved requests cannot be deleted");
		}

		requestRepository.deleteById(id);
	}

}
