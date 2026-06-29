package com.iagomoreira.urbanflow.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserQueryService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserValidationService validationService;

	public UserResponseDTO findById(String id) {

		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));

		return new UserResponseDTO(user);
	}

	public List<UserResponseDTO> findAll() {

		List<User> users = userRepository.findAll();

		return users.stream().map(UserResponseDTO::new).toList();
	}

	public List<UserResponseDTO> findOperatorsByDepartment(String departmentId) {

		validationService.validateDepartmentExists(departmentId);

		return userRepository.findByRoleAndDepartmentId(Role.OPERATOR, departmentId).stream().map(UserResponseDTO::new)
				.toList();
	}
}
