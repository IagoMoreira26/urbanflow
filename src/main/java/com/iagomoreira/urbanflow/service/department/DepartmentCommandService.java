package com.iagomoreira.urbanflow.service.department;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@Service
public class DepartmentCommandService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentValidationService departmentValidationService;
	private final DepartmentMapper departmentMapper;
	private final DateTimeProvider dateTimeProvider;

	public DepartmentCommandService(DepartmentRepository departmentRepository,
			DepartmentValidationService departmentValidationService, DepartmentMapper departmentMapper,
			DateTimeProvider dateTimeProvider) {
		this.departmentRepository = departmentRepository;
		this.departmentValidationService = departmentValidationService;
		this.departmentMapper = departmentMapper;
		this.dateTimeProvider = dateTimeProvider;
	}

	public DepartmentResponseDTO create(CreateDepartmentDTO dto) {
		departmentValidationService.validateDepartmentNameAlreadyExists(dto.getName());
		Department department = departmentMapper.toEntity(dto);

		department.setCreatedAt(dateTimeProvider.now());

		department = departmentRepository.save(department);
		return departmentMapper.toResponse(department);
	}

	public DepartmentResponseDTO update(String id, UpdateDepartmentDTO dto) {
		Department department = departmentValidationService.validateDepartmentExists(id);
		departmentValidationService.validateDepartmentNameForUpdate(department, dto.getName());

		departmentMapper.updateEntity(department, dto);
		department.setUpdatedAt(dateTimeProvider.now());

		department = departmentRepository.save(department);
		return departmentMapper.toResponse(department);
	}

	public void delete(String id) {
		departmentValidationService.validateDepartmentExists(id);
		departmentRepository.deleteById(id);
	}
}