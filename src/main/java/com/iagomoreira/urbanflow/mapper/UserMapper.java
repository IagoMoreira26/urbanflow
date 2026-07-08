package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.User;

@Component
public class UserMapper {

	private final AddressMapper addressMapper;

	public UserMapper(AddressMapper addressMapper) {
		this.addressMapper = addressMapper;
	}

	public User toEntity(CreateUserDTO dto, String encodedPassword) {

		User user = new User();

		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPassword(encodedPassword);
		user.setCpf(dto.getCpf());

		if (dto.getAddress() != null) {
			user.setAddress(addressMapper.toEntity(dto.getAddress()));
		}

		return user;
	}

	public void updateEntity(User user, UpdateUserDTO dto) {

		user.setName(dto.getName());
		user.setEmail(dto.getEmail());

		if (dto.getAddress() != null) {
			user.setAddress(addressMapper.toEntity(dto.getAddress()));
		}
	}

	public UserResponseDTO toResponse(User user) {

		if (user == null) {
			return null;
		}

		UserResponseDTO dto = new UserResponseDTO();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setRole(user.getRole());
		dto.setDepartmentId(user.getDepartmentId());

		if (user.getAddress() != null) {
			dto.setAddress(addressMapper.toResponse(user.getAddress()));
		}

		dto.setCreatedAt(user.getCreatedAt());
		dto.setUpdatedAt(user.getUpdatedAt());
		return dto;
	}
}