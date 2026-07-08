package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.model.Department;

class DepartmentMapperTest {

	private DepartmentMapper departmentMapper;

	@BeforeEach
	void setUp() {
		departmentMapper = new DepartmentMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateDepartmentDTO dto = new CreateDepartmentDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Departamento de infraestrutura urbana");

		Department entity = departmentMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getDescription(), entity.getDescription());
	}

	@Test
	void updateEntity_shouldUpdateEntityFromDto() {
		Department department = new Department();
		department.setName("Antigo");
		department.setDescription("Antiga descrição");

		UpdateDepartmentDTO dto = new UpdateDepartmentDTO();
		dto.setName("Infraestrutura");
		dto.setDescription("Departamento de infraestrutura urbana");

		departmentMapper.updateEntity(department, dto);

		assertEquals(dto.getName(), department.getName());
		assertEquals(dto.getDescription(), department.getDescription());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Department department = new Department();
		department.setId("dep-1");
		department.setName("Infraestrutura");
		department.setDescription("Departamento de infraestrutura urbana");
		department.setCreatedAt(LocalDateTime.now());
		department.setUpdatedAt(LocalDateTime.now());

		DepartmentResponseDTO dto = departmentMapper.toResponse(department);

		assertNotNull(dto);
		assertEquals(department.getId(), dto.getId());
		assertEquals(department.getName(), dto.getName());
		assertEquals(department.getDescription(), dto.getDescription());
		assertEquals(department.getCreatedAt(), dto.getCreatedAt());
		assertEquals(department.getUpdatedAt(), dto.getUpdatedAt());
	}

	@Test
	void toResponse_shouldReturnNullWhenDepartmentIsNull() {
		DepartmentResponseDTO dto = departmentMapper.toResponse(null);
		assertNull(dto);
	}
}