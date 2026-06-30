package com.iagomoreira.urbanflow.service.department;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;

@Service
public class DepartmentService {

	private final DepartmentCommandService departmentCommandService;
	private final DepartmentQueryService departmentQueryService;

	public DepartmentService(DepartmentCommandService departmentCommandService,
			DepartmentQueryService departmentQueryService) {
		super();
		this.departmentCommandService = departmentCommandService;
		this.departmentQueryService = departmentQueryService;
	}

	public DepartmentResponseDTO create(CreateDepartmentDTO dto) {
		return departmentCommandService.create(dto);
	}

	public List<DepartmentResponseDTO> findAll() {
		return departmentQueryService.findAll();
	}

	public DepartmentResponseDTO findById(String id) {
		return departmentQueryService.findById(id);
	}

	public DepartmentResponseDTO update(String id, UpdateDepartmentDTO dto) {
		return departmentCommandService.update(id, dto);
	}

	public void delete(String id) {
		departmentCommandService.delete(id);
	}
}