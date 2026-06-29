package com.iagomoreira.urbanflow.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.User;
import com.iagomoreira.urbanflow.model.enums.Role;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class UserValidationService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public void validateEmailAlreadyExists(String email) {

		if (userRepository.existsByEmail(email)) {
			throw new BusinessException("Email already registered");
		}
	}

	public void validateCpfAlreadyExists(String cpf) {

		if (userRepository.existsByCpf(cpf)) {
			throw new BusinessException("CPF already registered");
		}
	}

	public User validateUserExists(String id) {

		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
	}

	public void validateEmailForUpdate(User user, String newEmail) {

		if (!user.getEmail().equals(newEmail) && userRepository.existsByEmail(newEmail)) {
			throw new BusinessException("Email already registered");
		}
	}

	public void validateDepartment(Role role, String departmentId) {

		if (role == Role.OPERATOR) {

			if (departmentId == null || departmentId.isBlank()) {
				throw new BusinessException("Operator must belong to a department");
			}

			if (!departmentRepository.existsById(departmentId)) {
				throw new ResourceNotFoundException("Department not found");
			}
		}
	}

	public void validateDepartmentExists(String departmentId) {

		if (!departmentRepository.existsById(departmentId)) {
			throw new ResourceNotFoundException("Department not found");
		}
	}
}