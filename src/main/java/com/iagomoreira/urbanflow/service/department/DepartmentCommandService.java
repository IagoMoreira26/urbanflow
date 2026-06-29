package com.iagomoreira.urbanflow.service.department;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentCommandService {

	@Autowired
	private DepartmentRepository repository;

	@Autowired
	private DepartmentValidationService validationService;

	private Department fromDTO(CreateDepartmentDTO dto) {

		Department department = new Department();

		department.setName(dto.getName());
		department.setDescription(dto.getDescription());

		return department;
	}

	public DepartmentResponseDTO create(CreateDepartmentDTO dto) {

		validationService.validateDepartmentNameAlreadyExists(dto.getName());

		Department department = fromDTO(dto);

		department.setCreatedAt(LocalDateTime.now());

		department = repository.save(department);

		return new DepartmentResponseDTO(department);
	}

	public DepartmentResponseDTO update(String id, UpdateDepartmentDTO dto) {

		Department department = validationService.validateDepartmentExists(id);

		validationService.validateDepartmentNameForUpdate(department, dto.getName());

		department.setName(dto.getName());
		department.setDescription(dto.getDescription());
		department.setUpdatedAt(LocalDateTime.now());

		department = repository.save(department);

		return new DepartmentResponseDTO(department);
	}

	public void delete(String id) {

		validationService.validateDepartmentExists(id);

		repository.deleteById(id);
	}
}