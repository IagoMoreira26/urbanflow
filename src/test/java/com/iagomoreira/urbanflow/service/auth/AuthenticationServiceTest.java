package com.iagomoreira.urbanflow.service.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.iagomoreira.urbanflow.dto.auth.LoginDTO;
import com.iagomoreira.urbanflow.dto.auth.LoginResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class AuthenticationServiceTest {

	@Mock
	private AuthenticationManager authenticationManager;

	@Mock
	private UserRepository userRepository;

	@Mock
	private TokenService tokenService;

	@InjectMocks
	private AuthenticationService authenticationService;

	private LoginDTO loginDTO;
	private User user;
	private final String email = "maria.patos@example.com";
	private final String password = "patos123";
	private final String token = "jwt-token";

	@BeforeEach
	void setUp() {
		loginDTO = new LoginDTO();
		loginDTO.setEmail(email);
		loginDTO.setPassword(password);

		user = new User();
		user.setEmail(email);
		user.setRole(Role.CITIZEN);
	}

	@Test
	void login_shouldAuthenticateAndReturnToken() {
		when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));
		when(tokenService.generateToken(email, Role.CITIZEN.name())).thenReturn(token);

		LoginResponseDTO response = authenticationService.login(loginDTO);
		assertEquals(token, response.getToken());

		verify(authenticationManager).authenticate(new UsernamePasswordAuthenticationToken(email, password));
		verify(userRepository).findByEmail(email);
		verify(tokenService).generateToken(email, Role.CITIZEN.name());
	}

	@Test
	void login_shouldThrowResourceNotFoundException_whenUserNotFound() {
		when(userRepository.findByEmail(email)).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> authenticationService.login(loginDTO));

		verify(authenticationManager).authenticate(any());
		verify(userRepository).findByEmail(email);
		verify(tokenService, never()).generateToken(anyString(), anyString());
	}
}