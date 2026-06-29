package com.iagomoreira.urbanflow.service.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.service.SecurityService;

@Service
public class RequestValidationService {

	@Autowired
	private SecurityService securityService;

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
}