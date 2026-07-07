package com.iagomoreira.urbanflow.service.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class DepartmentQueryServiceTest {

	@Mock
	private DepartmentRepository departmentRepository;

	@Mock
	private DepartmentValidationService departmentValidationService;

	@Mock
	private DepartmentMapper departmentMapper;

	@InjectMocks
	private DepartmentQueryService departmentQueryService;

	private Department department;
	private DepartmentResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		department = new Department();
		department.setId("department-id");
		department.setName("Infraestrutura");
		department.setDescription("Departamento responsável pela infraestrutura.");

		responseDTO = new DepartmentResponseDTO();
		responseDTO.setId("department-id");
		responseDTO.setName("Infraestrutura");
		responseDTO.setDescription("Departamento responsável pela infraestrutura.");
	}

	@Test
	void shouldFindAllDepartments() {

		when(departmentRepository.findAll()).thenReturn(List.of(department));
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		List<DepartmentResponseDTO> result = departmentQueryService.findAll();

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(departmentRepository).findAll();
		verify(departmentMapper).toResponse(department);
	}

	@Test
	void shouldFindDepartmentById() {

		when(departmentValidationService.validateDepartmentExists("department-id")).thenReturn(department);
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		DepartmentResponseDTO result = departmentQueryService.findById("department-id");
		assertEquals(responseDTO, result);

		verify(departmentValidationService).validateDepartmentExists("department-id");
		verify(departmentMapper).toResponse(department);
	}
}