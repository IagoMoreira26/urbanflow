package com.iagomoreira.urbanflow.service.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class UserCommandServiceTest {

	@Mock
	private UserRepository userRepository;

	@Mock
	private PasswordEncoder passwordEncoder;

	@Mock
	private UserValidationService userValidationService;

	@Mock
	private UserMapper userMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private UserCommandService service;

	@Test
	void shouldCreateUser() {

		CreateUserDTO dto = new CreateUserDTO();

		User entity = new User();
		User saved = new User();
		UserResponseDTO response = new UserResponseDTO();

		LocalDateTime now = LocalDateTime.now();

		when(passwordEncoder.encode(any())).thenReturn("encoded");
		when(userMapper.toEntity(dto, "encoded")).thenReturn(entity);
		when(dateTimeProvider.now()).thenReturn(now);
		when(userRepository.save(entity)).thenReturn(saved);
		when(userMapper.toResponse(saved)).thenReturn(response);

		UserResponseDTO result = service.create(dto);

		verify(userValidationService).validateEmailAlreadyExists(dto.getEmail());
		verify(userValidationService).validateCpfAlreadyExists(dto.getCpf());
		verify(passwordEncoder).encode(dto.getPassword());

		assertEquals(Role.CITIZEN, entity.getRole());
		assertNull(entity.getDepartmentId());
		assertEquals(now, entity.getCreatedAt());

		verify(userRepository).save(entity);
		assertEquals(response, result);
	}

	@Test
	void shouldUpdateUser() {

		String id = "1";

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setPassword("123");

		User user = new User();
		UserResponseDTO response = new UserResponseDTO();

		LocalDateTime now = LocalDateTime.now();

		when(userValidationService.validateUserExists(id)).thenReturn(user);
		when(passwordEncoder.encode("123")).thenReturn("encoded");
		when(dateTimeProvider.now()).thenReturn(now);
		when(userRepository.save(user)).thenReturn(user);
		when(userMapper.toResponse(user)).thenReturn(response);

		UserResponseDTO result = service.update(id, dto);

		verify(userValidationService).validateEmailForUpdate(user, dto.getEmail());
		verify(userMapper).updateEntity(user, dto);
		verify(passwordEncoder).encode("123");

		assertEquals(now, user.getUpdatedAt());
		verify(userRepository).save(user);
		assertEquals(response, result);
	}

	@Test
	void shouldUpdateWithoutChangingPassword() {

		String id = "1";

		UpdateUserDTO dto = new UpdateUserDTO();

		User user = new User();

		when(userValidationService.validateUserExists(id)).thenReturn(user);
		when(dateTimeProvider.now()).thenReturn(LocalDateTime.now());
		when(userRepository.save(user)).thenReturn(user);
		when(userMapper.toResponse(user)).thenReturn(new UserResponseDTO());

		service.update(id, dto);
		verify(passwordEncoder, never()).encode(anyString());
	}

	@Test
	void shouldNotEncodeBlankPassword() {

		String id = "1";

		UpdateUserDTO dto = new UpdateUserDTO();
		dto.setPassword("   ");

		User user = new User();

		when(userValidationService.validateUserExists(id)).thenReturn(user);
		when(dateTimeProvider.now()).thenReturn(LocalDateTime.now());
		when(userRepository.save(user)).thenReturn(user);
		when(userMapper.toResponse(user)).thenReturn(new UserResponseDTO());

		service.update(id, dto);
		verify(passwordEncoder, never()).encode(anyString());
	}

	@Test
	void shouldDeleteUser() {

		String id = "1";

		User user = new User();

		when(userValidationService.validateUserExists(id)).thenReturn(user);

		service.delete(id);
		verify(userRepository).deleteById(id);
	}
}
