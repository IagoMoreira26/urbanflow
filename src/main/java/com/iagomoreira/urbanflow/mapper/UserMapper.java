package com.iagomoreira.urbanflow.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
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
		user.setRole(dto.getRole());
		user.setDepartmentId(dto.getDepartmentId());
		user.setAddress(addressMapper.toEntity(dto.getAddress()));
		user.setCreatedAt(LocalDateTime.now());

		return user;
	}

	public void updateEntity(User user, UpdateUserDTO dto) {

		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setRole(dto.getRole());
		user.setDepartmentId(dto.getDepartmentId());

		if (dto.getAddress() != null) {
			user.setAddress(addressMapper.toEntity(dto.getAddress()));
		}

		user.setUpdatedAt(LocalDateTime.now());
	}
}