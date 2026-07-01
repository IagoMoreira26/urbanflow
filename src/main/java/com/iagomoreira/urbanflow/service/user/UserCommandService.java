package com.iagomoreira.urbanflow.service.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class UserCommandService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final UserValidationService userValidationService;
	private final UserMapper userMapper;
	private final DateTimeProvider dateTimeProvider;

	public UserCommandService(UserRepository userRepository, PasswordEncoder passwordEncoder,
			UserValidationService userValidationService, UserMapper userMapper, DateTimeProvider dateTimeProvider) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.userValidationService = userValidationService;
		this.userMapper = userMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public UserResponseDTO create(CreateUserDTO dto) {

		userValidationService.validateEmailAlreadyExists(dto.getEmail());
		userValidationService.validateCpfAlreadyExists(dto.getCpf());

		User user = userMapper.toEntity(dto, passwordEncoder.encode(dto.getPassword()));
		user.setRole(Role.CITIZEN);
		user.setDepartmentId(null);
		user.setCreatedAt(dateTimeProvider.now());

		user = userRepository.save(user);
		return userMapper.toResponse(user);
	}

	public UserResponseDTO update(String id, UpdateUserDTO dto) {

		User user = userValidationService.validateUserExists(id);

		userValidationService.validateEmailForUpdate(user, dto.getEmail());
		userMapper.updateEntity(user, dto);

		if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
			user.setPassword(passwordEncoder.encode(dto.getPassword()));
		}

		user.setUpdatedAt(dateTimeProvider.now());

		user = userRepository.save(user);
		return userMapper.toResponse(user);
	}

	public void delete(String id) {
		userValidationService.validateUserExists(id);
		userRepository.deleteById(id);
	}
}