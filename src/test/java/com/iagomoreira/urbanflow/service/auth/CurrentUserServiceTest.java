package com.iagomoreira.urbanflow.service.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class CurrentUserServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private UserMapper userMapper;

	@InjectMocks
	private CurrentUserService currentUserService;

	private final String email = "maria.patos@example.com";
	private User user;
	private UserResponseDTO userResponseDTO;

	@BeforeEach
	void setUp() {
		user = new User();
		user.setEmail(email);
		user.setName("Maria Patos");
		user.setRole(Role.CITIZEN);

		userResponseDTO = new UserResponseDTO();
		userResponseDTO.setEmail(email);
		userResponseDTO.setName("Maria Patos");
		userResponseDTO.setRole(Role.CITIZEN);

		Authentication authentication = org.mockito.Mockito.mock(Authentication.class);
		when(authentication.getName()).thenReturn(email);

		SecurityContext securityContext = org.mockito.Mockito.mock(SecurityContext.class);
		when(securityContext.getAuthentication()).thenReturn(authentication);
		SecurityContextHolder.setContext(securityContext);
	}

	@Test
	void getCurrentUser_shouldReturnUserResponseDTO_whenUserExists() {
		when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		UserResponseDTO result = currentUserService.getCurrentUser();
		assertEquals(email, result.getEmail());
		assertEquals("Maria Patos", result.getName());
	}

	@Test
	void getCurrentUser_shouldThrowResourceNotFoundException_whenUserNotFound() {

		when(userRepository.findByEmail(email)).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> currentUserService.getCurrentUser());
	}
}