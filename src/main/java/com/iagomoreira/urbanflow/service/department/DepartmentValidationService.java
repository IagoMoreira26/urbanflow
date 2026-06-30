package com.iagomoreira.urbanflow.service.department;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentValidationService {

	private final DepartmentRepository departmentRepository;

	public DepartmentValidationService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	public Department validateDepartmentExists(String id) {
		return departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department not found"));
	}

	public void validateDepartmentNameAlreadyExists(String name) {
		if (departmentRepository.existsByName(name)) {
			throw new BusinessException("Department already exists");
		}
	}

	public void validateDepartmentNameForUpdate(Department department, String newName) {
		if (!department.getName().equals(newName) && departmentRepository.existsByName(newName)) {
			throw new BusinessException("Department already exists");
		}
	}
}