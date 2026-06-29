package com.iagomoreira.urbanflow.service.user;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.dto.user.CreateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UpdateUserDTO;
import com.iagomoreira.urbanflow.dto.user.UserResponseDTO;
import com.iagomoreira.urbanflow.model.Address;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserCommandService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserValidationService userValidationService;

	private User fromDTO(CreateUserDTO dto) {

		AddressDTO addressDTO = dto.getAddress();

		Address address = new Address(addressDTO.getCep(), addressDTO.getStreet(), addressDTO.getNumber(),
				addressDTO.getNeighborhood(), addressDTO.getCity(), addressDTO.getState(), addressDTO.getComplement());

		return new User(null, dto.getName(), dto.getEmail(), passwordEncoder.encode(dto.getPassword()), dto.getCpf(),
				dto.getRole(), dto.getDepartmentId(), address, LocalDateTime.now(), null);
	}

	public UserResponseDTO create(CreateUserDTO dto) {

		userValidationService.validateEmailAlreadyExists(dto.getEmail());

		userValidationService.validateCpfAlreadyExists(dto.getCpf());

		userValidationService.validateDepartment(dto.getRole(), dto.getDepartmentId());

		if (dto.getRole() != Role.OPERATOR) {
			dto.setDepartmentId(null);
		}

		User user = fromDTO(dto);

		user = userRepository.save(user);

		return new UserResponseDTO(user);
	}

	public UserResponseDTO update(String id, UpdateUserDTO dto) {

		User user = userValidationService.validateUserExists(id);

		userValidationService.validateEmailForUpdate(user, dto.getEmail());

		userValidationService.validateDepartment(dto.getRole(), dto.getDepartmentId());

		if (dto.getRole() != Role.OPERATOR) {
			dto.setDepartmentId(null);
		}
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());

		if (dto.getPassword() != null && !dto.getPassword().isBlank()) {

			user.setPassword(passwordEncoder.encode(dto.getPassword()));
		}

		user.setRole(dto.getRole());
		user.setDepartmentId(dto.getDepartmentId());

		if (dto.getAddress() != null) {

			Address address = new Address();

			address.setCep(dto.getAddress().getCep());
			address.setStreet(dto.getAddress().getStreet());
			address.setNumber(dto.getAddress().getNumber());
			address.setNeighborhood(dto.getAddress().getNeighborhood());
			address.setCity(dto.getAddress().getCity());
			address.setState(dto.getAddress().getState());
			address.setComplement(dto.getAddress().getComplement());

			user.setAddress(address);
		}

		user.setUpdatedAt(LocalDateTime.now());

		user = userRepository.save(user);

		return new UserResponseDTO(user);
	}

	public void delete(String id) {

		userValidationService.validateUserExists(id);
		userRepository.deleteById(id);
	}
}
