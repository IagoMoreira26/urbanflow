package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class RequestService {

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public RequestResponseDTO createRequest(CreateRequestDTO dto) {

		if (!userRepository.existsById(dto.getUserId())) {
			throw new ResourceNotFoundException("User not found");
		}

		if (!categoryRepository.existsById(dto.getCategoryId())) {
			throw new ResourceNotFoundException("Category not found");
		}

		if (!subCategoryRepository.existsById(dto.getSubCategoryId())) {
			throw new ResourceNotFoundException("SubCategory not found");
		}

		Request request = fromDTO(dto);

		request.setCreatedAt(LocalDateTime.now());

		request.setStatus(RequestStatus.RECEIVED);

		Request savedRequest = requestRepository.save(request);

		return new RequestResponseDTO(savedRequest);
	}

	private Request fromDTO(CreateRequestDTO dto) {

		Request request = new Request();

		request.setTitle(dto.getTitle());
		request.setDescription(dto.getDescription());

		request.setUserId(dto.getUserId());

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

	public List<RequestResponseDTO> findAll() {

		List<Request> requests = requestRepository.findAll();

		return requests.stream().map(RequestResponseDTO::new).toList();
	}

	public RequestResponseDTO findById(String id) {

		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		return new RequestResponseDTO(request);
	}
}
