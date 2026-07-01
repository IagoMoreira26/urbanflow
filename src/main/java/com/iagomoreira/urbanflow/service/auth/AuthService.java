package com.iagomoreira.urbanflow.service.auth;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;

@Service
public class AuthService {

	private final AuthenticationService authenticationService;
	private final CurrentUserService currentUserService;

	public AuthService(AuthenticationService authenticationService, CurrentUserService currentUserService) {
		super();
		this.authenticationService = authenticationService;
		this.currentUserService = currentUserService;
	}

	public LoginResponseDTO login(LoginDTO dto) {
		return authenticationService.login(dto);
	}

	public UserResponseDTO getCurrentUser() {
		return currentUserService.getCurrentUser();
	}

}