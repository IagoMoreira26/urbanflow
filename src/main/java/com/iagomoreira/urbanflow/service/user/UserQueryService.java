package com.iagomoreira.urbanflow.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserQueryService {

	private final UserRepository userRepository;
	private final UserValidationService userValidationService;

	public UserQueryService(UserRepository userRepository, UserValidationService userValidationService) {
		super();
		this.userRepository = userRepository;
		this.userValidationService = userValidationService;
	}

	public UserResponseDTO findById(String id) {
		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
		return new UserResponseDTO(user);
	}

	public List<UserResponseDTO> findAll() {
		List<User> users = userRepository.findAll();
		return users.stream().map(UserResponseDTO::new).toList();
	}

	public List<UserResponseDTO> findOperatorsByDepartment(String departmentId) {
		userValidationService.validateDepartmentExists(departmentId);
		return userRepository.findByRoleAndDepartmentId(Role.OPERATOR, departmentId).stream().map(UserResponseDTO::new)
				.toList();
	}
}
