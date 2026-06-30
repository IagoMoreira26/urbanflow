package com.iagomoreira.urbanflow.service.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentQueryService {

	private final DepartmentRepository departmentRepository;
	private final DepartmentValidationService departmentValidationService;

	public DepartmentQueryService(DepartmentRepository departmentRepository,
			DepartmentValidationService departmentValidationService) {
		super();
		this.departmentRepository = departmentRepository;
		this.departmentValidationService = departmentValidationService;
	}

	public List<DepartmentResponseDTO> findAll() {
		return departmentRepository.findAll().stream().map(DepartmentResponseDTO::new).toList();
	}

	public DepartmentResponseDTO findById(String id) {
		return new DepartmentResponseDTO(departmentValidationService.validateDepartmentExists(id));
	}
}