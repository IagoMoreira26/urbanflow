package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.model.Department;

@Component
public class DepartmentMapper {

	public Department toEntity(CreateDepartmentDTO dto) {
		Department department = new Department();
		department.setName(dto.getName());
		department.setDescription(dto.getDescription());
		return department;
	}

	public void updateEntity(Department department, UpdateDepartmentDTO dto) {
		department.setName(dto.getName());
		department.setDescription(dto.getDescription());
	}

	public DepartmentResponseDTO toResponse(Department department) {
		DepartmentResponseDTO dto = new DepartmentResponseDTO();
		dto.setId(department.getId());
		dto.setName(department.getName());
		dto.setDescription(department.getDescription());
		dto.setCreatedAt(department.getCreatedAt());
		dto.setUpdatedAt(department.getUpdatedAt());
		return dto;
	}
}