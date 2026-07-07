package com.iagomoreira.urbanflow.service.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserQueryServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private UserValidationService userValidationService;

	@Mock
	private UserMapper userMapper;

	@InjectMocks
	private UserQueryService userQueryService;

	private User user;
	private UserResponseDTO userResponseDTO;

	@BeforeEach
	void setUp() {
		user = new User();
		user.setId("user-id");
		user.setName("Iago");
		user.setEmail("iago@email.com");
		user.setRole(Role.OPERATOR);
		user.setDepartmentId("department-id");

		userResponseDTO = new UserResponseDTO();
		userResponseDTO.setId(user.getId());
		userResponseDTO.setName(user.getName());
		userResponseDTO.setEmail(user.getEmail());
		userResponseDTO.setRole(user.getRole());
		userResponseDTO.setDepartmentId(user.getDepartmentId());
	}

	@Test
	void shouldFindUserById() {

		when(userRepository.findById("user-id")).thenReturn(Optional.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		UserResponseDTO response = userQueryService.findById("user-id");

		assertEquals(user.getId(), response.getId());
		assertEquals(user.getName(), response.getName());

		verify(userRepository).findById("user-id");
		verify(userMapper).toResponse(user);
	}

	@Test
	void shouldThrowWhenUserNotFound() {

		when(userRepository.findById("user-id")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> userQueryService.findById("user-id"));

		verify(userRepository).findById("user-id");
		verifyNoInteractions(userMapper);
	}

	@Test
	void shouldFindAllUsers() {

		when(userRepository.findAll()).thenReturn(List.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		List<UserResponseDTO> response = userQueryService.findAll();
		assertEquals(1, response.size());
		assertEquals(user.getId(), response.get(0).getId());

		verify(userRepository).findAll();
		verify(userMapper).toResponse(user);
	}

	@Test
	void shouldFindOperatorsByDepartment() {

		doNothing().when(userValidationService).validateDepartmentExists("department-id");
		when(userRepository.findByRoleAndDepartmentId(Role.OPERATOR, "department-id")).thenReturn(List.of(user));
		when(userMapper.toResponse(user)).thenReturn(userResponseDTO);

		List<UserResponseDTO> response = userQueryService.findOperatorsByDepartment("department-id");
		assertEquals(1, response.size());
		assertEquals(user.getId(), response.get(0).getId());

		verify(userValidationService).validateDepartmentExists("department-id");
		verify(userRepository).findByRoleAndDepartmentId(Role.OPERATOR, "department-id");
		verify(userMapper).toResponse(user);
	}
}