package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.exception.DatabaseException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User fromDTO(CreateUserDTO dto) {

		AddressDTO addressDTO = dto.getAddress();

		Address address = new Address(addressDTO.getCep(), addressDTO.getStreet(), addressDTO.getNumber(),
				addressDTO.getNeighborhood(), addressDTO.getCity(), addressDTO.getState(), addressDTO.getComplement());

		return new User(null, dto.getName(), dto.getEmail(), dto.getPassword(), dto.getCpf(), address,
				LocalDateTime.now(), null);
	}

	public UserResponseDTO createUser(CreateUserDTO dto) {

		userRepository.findByEmail(dto.getEmail()).ifPresent(user -> {
			throw new DatabaseException("Email already exists");
		});

		userRepository.findByCpf(dto.getCpf()).ifPresent(user -> {
			throw new DatabaseException("CPF already exists");
		});

		User user = fromDTO(dto);

		user = userRepository.save(user);

		return new UserResponseDTO(user);
	}

	public UserResponseDTO findById(String id) {

		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));

		return new UserResponseDTO(user);
	}

	public List<UserResponseDTO> findAll() {

		List<User> users = userRepository.findAll();

		return users.stream().map(UserResponseDTO::new).toList();
	}
}
