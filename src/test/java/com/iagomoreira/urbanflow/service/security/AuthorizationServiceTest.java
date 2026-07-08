package com.iagomoreira.urbanflow.service.security;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.model.Request;

@ExtendWith(MockitoExtension.class)
class AuthorizationServiceTest {

	@Mock
	private SecurityService securityService;

	@InjectMocks
	private AuthorizationService authorizationService;

	private Request request;
	private final String departmentId = "dep-123";
	private final String userId = "user-456";

	@BeforeEach
	void setUp() {
		request = new Request();
		request.setDepartmentId(departmentId);
		request.setUserId(userId);
	}

	@Test
	void validateRequestAccess_shouldAllowAdminAccess() {
		when(securityService.isAdmin()).thenReturn(true);

		assertDoesNotThrow(() -> authorizationService.validateRequestAccess(request));
	}

	@Test
	void validateRequestAccess_shouldAllowOperatorWhenSameDepartment() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn(departmentId);

		assertDoesNotThrow(() -> authorizationService.validateRequestAccess(request));
	}

	@Test
	void validateRequestAccess_shouldThrowBusinessExceptionWhenOperatorDifferentDepartment() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(true);
		when(securityService.getAuthenticatedDepartmentId()).thenReturn("other-dept");

		assertThrows(BusinessException.class, () -> authorizationService.validateRequestAccess(request),
				"Access denied");
	}

	@Test
	void validateRequestAccess_shouldAllowCitizenWhenSameUser() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn(userId);

		assertDoesNotThrow(() -> authorizationService.validateRequestAccess(request));
	}

	@Test
	void validateRequestAccess_shouldThrowBusinessExceptionWhenCitizenDifferentUser() {
		when(securityService.isAdmin()).thenReturn(false);
		when(securityService.isOperator()).thenReturn(false);
		when(securityService.isCitizen()).thenReturn(true);
		when(securityService.getAuthenticatedUserId()).thenReturn("other-user");

		assertThrows(BusinessException.class, () -> authorizationService.validateRequestAccess(request),
				"Access denied");
	}
}