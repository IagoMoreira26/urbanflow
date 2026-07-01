package com.iagomoreira.urbanflow.service.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class AuthenticationService {

	private final AuthenticationManager authenticationManager;
	private final UserRepository userRepository;
	private final TokenService tokenService;

	public AuthenticationService(AuthenticationManager authenticationManager, UserRepository userRepository,
			TokenService tokenService) {
		this.authenticationManager = authenticationManager;
		this.userRepository = userRepository;
		this.tokenService = tokenService;
	}

	public LoginResponseDTO login(LoginDTO dto) {

		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword()));
		User user = userRepository.findByEmail(dto.getEmail())
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		String token = tokenService.generateToken(user.getEmail(), user.getRole().name());
		return new LoginResponseDTO(token);
	}
}
