package com.iagomoreira.urbanflow.service.department;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.department.CreateDepartmentDTO;
import com.iagomoreira.urbanflow.dto.department.DepartmentResponseDTO;
import com.iagomoreira.urbanflow.dto.department.UpdateDepartmentDTO;
import com.iagomoreira.urbanflow.mapper.DepartmentMapper;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.service.common.DateTimeProvider;

@ExtendWith(MockitoExtension.class)
class DepartmentCommandServiceTest {

	@Mock
	private DepartmentRepository departmentRepository;

	@Mock
	private DepartmentValidationService departmentValidationService;

	@Mock
	private DepartmentMapper departmentMapper;

	@Mock
	private DateTimeProvider dateTimeProvider;

	@InjectMocks
	private DepartmentCommandService departmentCommandService;

	private Department department;
	private DepartmentResponseDTO responseDTO;
	private CreateDepartmentDTO createDTO;
	private UpdateDepartmentDTO updateDTO;

	private final LocalDateTime now = LocalDateTime.of(2025, 1, 1, 10, 0);

	@BeforeEach
	void setUp() {

		createDTO = new CreateDepartmentDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Description");

		updateDTO = new UpdateDepartmentDTO();
		updateDTO.setName("Updated");
		updateDTO.setDescription("Updated Description");

		department = new Department();
		department.setId("1");
		department.setName("Infrastructure");
		department.setDescription("Description");

		responseDTO = new DepartmentResponseDTO();
		responseDTO.setId("1");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Description");
	}

	@Test
	void shouldCreateDepartment() {

		doNothing().when(departmentValidationService).validateDepartmentNameAlreadyExists(createDTO.getName());

		when(departmentMapper.toEntity(createDTO)).thenReturn(department);
		when(dateTimeProvider.now()).thenReturn(now);
		when(departmentRepository.save(department)).thenReturn(department);
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		DepartmentResponseDTO result = departmentCommandService.create(createDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, department.getCreatedAt());

		verify(departmentValidationService).validateDepartmentNameAlreadyExists(createDTO.getName());
		verify(departmentMapper).toEntity(createDTO);
		verify(departmentRepository).save(department);
		verify(departmentMapper).toResponse(department);
	}

	@Test
	void shouldUpdateDepartment() {

		when(departmentValidationService.validateDepartmentExists("1")).thenReturn(department);
		doNothing().when(departmentValidationService).validateDepartmentNameForUpdate(department, updateDTO.getName());

		when(dateTimeProvider.now()).thenReturn(now);
		when(departmentRepository.save(department)).thenReturn(department);
		when(departmentMapper.toResponse(department)).thenReturn(responseDTO);

		DepartmentResponseDTO result = departmentCommandService.update("1", updateDTO);

		assertEquals(responseDTO, result);
		assertEquals(now, department.getUpdatedAt());

		verify(departmentMapper).updateEntity(department, updateDTO);
		verify(departmentRepository).save(department);
		verify(departmentMapper).toResponse(department);
	}

	@Test
	void shouldDeleteDepartment() {

		when(departmentValidationService.validateDepartmentExists("1")).thenReturn(department);
		departmentCommandService.delete("1");

		verify(departmentValidationService).validateDepartmentExists("1");
		verify(departmentRepository).deleteById("1");
	}
}