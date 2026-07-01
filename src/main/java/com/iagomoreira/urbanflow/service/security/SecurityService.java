package com.iagomoreira.urbanflow.service.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.security.UserDetailsImplementation;

@Service
public class SecurityService {

	public UserDetailsImplementation getAuthenticatedUser() {
		return (UserDetailsImplementation) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	public String getAuthenticatedEmail() {
		return getAuthenticatedUser().getUsername();
	}

	public String getAuthenticatedUserId() {
		return getAuthenticatedUser().getId();
	}

	public String getAuthenticatedDepartmentId() {
		return getAuthenticatedUser().getDepartmentId();
	}

	public Role getAuthenticatedRole() {
		return getAuthenticatedUser().getRole();
	}

	public boolean isAdmin() {
		return getAuthenticatedRole() == Role.ADMIN;
	}

	public boolean isOperator() {
		return getAuthenticatedRole() == Role.OPERATOR;
	}

	public boolean isCitizen() {
		return getAuthenticatedRole() == Role.CITIZEN;
	}
}