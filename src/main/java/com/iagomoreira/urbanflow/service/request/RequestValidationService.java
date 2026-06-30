package com.iagomoreira.urbanflow.service.request;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.request.CreateRequestDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.SecurityService;

@Service
public class RequestValidationService {

	private final SecurityService securityService;
	private final UserRepository userRepository;
	private final SubCategoryRepository subCategoryRepository;

	public RequestValidationService(SecurityService securityService, UserRepository userRepository,
			SubCategoryRepository subCategoryRepository) {
		super();
		this.securityService = securityService;
		this.userRepository = userRepository;
		this.subCategoryRepository = subCategoryRepository;
	}

	public void validateStatusTransition(RequestStatus current, RequestStatus next) {

		switch (current) {

		case RECEIVED:
			if (next != RequestStatus.UNDER_REVIEW && next != RequestStatus.CANCELLED) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case UNDER_REVIEW:
			if (next != RequestStatus.APPROVED && next != RequestStatus.REJECTED) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case APPROVED:
			if (next != RequestStatus.IN_PROGRESS) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case IN_PROGRESS:
			if (next != RequestStatus.RESOLVED) {
				throw new BusinessException("Invalid status transition");
			}
			break;

		case RESOLVED:
		case REJECTED:
		case CANCELLED:
			throw new BusinessException("Request is already finalized");
		}
	}

	public void validateRequestAccess(Request request) {
		securityService.validateRequestAccess(request);
	}

	public void validateAuthenticatedUser(String userId) {

		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("Authenticated user not found");
		}
	}

	public SubCategory validateSubCategory(CreateRequestDTO dto) {

		SubCategory subCategory = subCategoryRepository.findById(dto.getSubCategoryId())
				.orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));

		if (!subCategory.getCategoryId().equals(dto.getCategoryId())) {
			throw new BusinessException("SubCategory does not belong to the selected category");
		}

		return subCategory;
	}

	public void validateRequestEditable(Request request) {

		if (request.getStatus() == RequestStatus.RESOLVED || request.getStatus() == RequestStatus.CANCELLED) {
			throw new BusinessException("Resolved or cancelled requests cannot be modified");
		}
	}

	public void validateRequestDeletion(Request request) {

		if (request.getStatus() == RequestStatus.RESOLVED) {
			throw new BusinessException("Resolved requests cannot be deleted");
		}
	}
}