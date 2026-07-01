package com.iagomoreira.urbanflow.service.auth;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.mapper.UserMapper;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class CurrentUserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	public CurrentUserService(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}

	public UserResponseDTO getCurrentUser() {

		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.findByEmail(email)
				.orElseThrow(() -> new ResourceNotFoundException("User not found"));

		return userMapper.toResponse(user);
	}
}
