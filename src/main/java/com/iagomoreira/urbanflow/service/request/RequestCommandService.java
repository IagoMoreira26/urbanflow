package com.iagomoreira.urbanflow.service.request;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.dto.request.RequestResponseDTO;
import com.iagomoreira.urbanflow.dto.request.UpdateRequestDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.RequestMapper;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;
import com.iagomoreira.urbanflow.service.security.SecurityService;

@Service
public class RequestCommandService {

	private final RequestRepository requestRepository;
	private final RequestValidationService requestValidationService;
	private final SecurityService securityService;
	private final RequestMapper requestMapper;
	private final DateTimeProvider dateTimeProvider;

	public RequestCommandService(RequestRepository requestRepository, UserRepository userRepository,
			RequestValidationService requestValidationService, SecurityService securityService,
			SubCategoryRepository subCategoryRepository, RequestMapper requestMapper,
			DateTimeProvider dateTimeProvider) {
		this.requestRepository = requestRepository;
		this.requestValidationService = requestValidationService;
		this.securityService = securityService;
		this.requestMapper = requestMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public RequestResponseDTO create(CreateRequestDTO dto) {
		String authenticatedUserId = securityService.getAuthenticatedUserId();
		requestValidationService.validateAuthenticatedUser(authenticatedUserId);

		SubCategory subCategory = requestValidationService.validateSubCategory(dto);
		Request request = requestMapper.toEntity(dto);

		request.setUserId(authenticatedUserId);
		request.setDepartmentId(subCategory.getDepartmentId());
		request.setStatus(RequestStatus.RECEIVED);
		request.setCreatedAt(dateTimeProvider.now());
		request.setUpdatedAt(dateTimeProvider.now());

		request = requestRepository.save(request);
		return requestMapper.toResponse(request);
	}

	public RequestResponseDTO update(String id, UpdateRequestDTO dto) {
		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		requestValidationService.validateRequestEditable(request);
		requestMapper.updateEntity(request, dto);
		request.setUpdatedAt(dateTimeProvider.now());

		request = requestRepository.save(request);
		return requestMapper.toResponse(request);
	}

	public void delete(String id) {
		Request request = requestRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));

		requestValidationService.validateRequestAccess(request);
		requestValidationService.validateRequestDeletion(request);
		requestRepository.deleteById(id);
	}
}