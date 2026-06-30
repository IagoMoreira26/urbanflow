package com.iagomoreira.urbanflow.service;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class AuthService {

	private final AuthenticationManager authenticationManager;
	private final UserRepository userRepository;
	private final JWTService jwtService;

	public AuthService(AuthenticationManager authenticationManager, UserRepository userRepository,
			JWTService jwtService) {
		super();
		this.authenticationManager = authenticationManager;
		this.userRepository = userRepository;
		this.jwtService = jwtService;
	}

	public UserResponseDTO getCurrentUser() {

		String email = SecurityContextHolder.getContext().getAuthentication().getName();

		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		return new UserResponseDTO(user);
	}

	public LoginResponseDTO login(LoginDTO dto) {

		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword()));

		User user = userRepository.findByEmail(dto.getEmail())
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		String token = jwtService.generateToken(user.getEmail(), user.getRole().name());

		return new LoginResponseDTO(token);
	}
}