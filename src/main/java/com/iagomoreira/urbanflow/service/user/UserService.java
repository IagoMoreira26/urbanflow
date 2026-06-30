package com.iagomoreira.urbanflow.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;

@Service
public class UserService {

	private final UserCommandService userCommandService;
	private final UserQueryService userQueryService;

	public UserService(UserCommandService userCommandService, UserQueryService userQueryService) {
		super();
		this.userCommandService = userCommandService;
		this.userQueryService = userQueryService;
	}

	public UserResponseDTO create(CreateUserDTO dto) {
		return userCommandService.create(dto);
	}

	public UserResponseDTO update(String id, UpdateUserDTO dto) {
		return userCommandService.update(id, dto);
	}

	public void delete(String id) {
		userCommandService.delete(id);
	}

	public UserResponseDTO findById(String id) {
		return userQueryService.findById(id);
	}

	public List<UserResponseDTO> findAll() {
		return userQueryService.findAll();
	}

	public List<UserResponseDTO> findOperatorsByDepartment(String departmentId) {
		return userQueryService.findOperatorsByDepartment(departmentId);
	}
}
