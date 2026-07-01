package com.iagomoreira.urbanflow.service.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentQueryService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentValidationService departmentValidationService;
	private final DepartmentMapper departmentMapper;

	public DepartmentQueryService(DepartmentRepository departmentRepository,
			DepartmentValidationService departmentValidationService, DepartmentMapper departmentMapper) {
		this.departmentRepository = departmentRepository;
		this.departmentValidationService = departmentValidationService;
		this.departmentMapper = departmentMapper;
	}

	public List<DepartmentResponseDTO> findAll() {
		return departmentRepository.findAll().stream().map(departmentMapper::toResponse).toList();
	}

	public DepartmentResponseDTO findById(String id) {
		Department department = departmentValidationService.validateDepartmentExists(id);
		return departmentMapper.toResponse(department);
	}
}