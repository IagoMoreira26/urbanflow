package com.iagomoreira.urbanflow.service.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentValidationService {

	@Autowired
	private DepartmentRepository repository;

	public Department validateDepartmentExists(String id) {

		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department not found"));
	}

	public void validateDepartmentNameAlreadyExists(String name) {

		if (repository.existsByName(name)) {
			throw new BusinessException("Department already exists");
		}
	}

	public void validateDepartmentNameForUpdate(Department department, String newName) {

		if (!department.getName().equals(newName) && repository.existsByName(newName)) {

			throw new BusinessException("Department already exists");
		}
	}
}