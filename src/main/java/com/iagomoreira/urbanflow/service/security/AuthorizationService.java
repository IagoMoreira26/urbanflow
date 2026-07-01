package com.iagomoreira.urbanflow.service.security;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.model.Request;

@Service
public class AuthorizationService {

	private final SecurityService securityService;

	public AuthorizationService(SecurityService securityService) {
		this.securityService = securityService;
	}

	public void validateRequestAccess(Request request) {
		if (securityService.isAdmin()) {
			return;
		}
		if (securityService.isOperator()) {
			if (!securityService.getAuthenticatedDepartmentId().equals(request.getDepartmentId())) {
				throw new BusinessException("Access denied");
			}
			return;
		}
		if (securityService.isCitizen()) {
			if (!securityService.getAuthenticatedUserId().equals(request.getUserId())) {
				throw new BusinessException("Access denied");
			}
		}
	}
}