package com.iagomoreira.urbanflow.service.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@Service
public class DepartmentQueryService {

	@Autowired
	private DepartmentRepository repository;

	@Autowired
	private DepartmentValidationService validationService;

	public List<DepartmentResponseDTO> findAll() {

		return repository.findAll().stream().map(DepartmentResponseDTO::new).toList();
	}

	public DepartmentResponseDTO findById(String id) {

		return new DepartmentResponseDTO(validationService.validateDepartmentExists(id));
	}
}