package com.iagomoreira.urbanflow.service.department;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentCommandService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentValidationService departmentValidationService;
	private final DepartmentMapper departmentMapper;

	public DepartmentCommandService(DepartmentRepository departmentRepository,
			DepartmentValidationService departmentValidationService, DepartmentMapper departmentMapper) {
		this.departmentRepository = departmentRepository;
		this.departmentValidationService = departmentValidationService;
		this.departmentMapper = departmentMapper;
	}

	public DepartmentResponseDTO create(CreateDepartmentDTO dto) {

		departmentValidationService.validateDepartmentNameAlreadyExists(dto.getName());
		Department department = departmentMapper.toEntity(dto);

		department.setCreatedAt(LocalDateTime.now());

		department = departmentRepository.save(department);
		return new DepartmentResponseDTO(department);
	}

	public DepartmentResponseDTO update(String id, UpdateDepartmentDTO dto) {

		Department department = departmentValidationService.validateDepartmentExists(id);
		departmentValidationService.validateDepartmentNameForUpdate(department, dto.getName());

		departmentMapper.updateEntity(department, dto);
		department.setUpdatedAt(LocalDateTime.now());

		department = departmentRepository.save(department);
		return new DepartmentResponseDTO(department);
	}

	public void delete(String id) {
		departmentValidationService.validateDepartmentExists(id);
		departmentRepository.deleteById(id);
	}
}