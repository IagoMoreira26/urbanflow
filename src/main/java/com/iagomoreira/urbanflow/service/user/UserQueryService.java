package com.iagomoreira.urbanflow.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserQueryService {

	private final UserRepository userRepository;
	private final UserValidationService userValidationService;
	private final UserMapper userMapper;

	public UserQueryService(UserRepository userRepository, UserValidationService userValidationService,
			UserMapper userMapper) {
		super();
		this.userRepository = userRepository;
		this.userValidationService = userValidationService;
		this.userMapper = userMapper;
	}

	public UserResponseDTO findById(String id) {
		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
		return userMapper.toResponse(user);
	}

	public List<UserResponseDTO> findAll() {
		List<User> users = userRepository.findAll();
		return users.stream().map(userMapper::toResponse).toList();
	}

	public List<UserResponseDTO> findOperatorsByDepartment(String departmentId) {
		userValidationService.validateDepartmentExists(departmentId);
		return userRepository.findByRoleAndDepartmentId(Role.OPERATOR, departmentId).stream()
				.map(userMapper::toResponse).toList();
	}
}
