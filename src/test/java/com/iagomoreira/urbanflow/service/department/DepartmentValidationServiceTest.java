package com.iagomoreira.urbanflow.service.department;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Department;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class DepartmentValidationServiceTest {

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private DepartmentValidationService departmentValidationService;

	private Department department;

	@BeforeEach
	void setup() {
		department = new Department();
		department.setId("1");
		department.setName("Infraestrutura");
	}

	@Test
	void shouldReturnDepartmentWhenDepartmentExists() {

		when(departmentRepository.findById("1")).thenReturn(Optional.of(department));
		Department result = departmentValidationService.validateDepartmentExists("1");
		assertEquals(department, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenDepartmentDoesNotExist() {

		when(departmentRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> departmentValidationService.validateDepartmentExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenDepartmentNameDoesNotExist() {

		when(departmentRepository.existsByName("Infraestrutura")).thenReturn(false);
		assertDoesNotThrow(() -> departmentValidationService.validateDepartmentNameAlreadyExists("Infraestrutura"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenDepartmentNameAlreadyExists() {

		when(departmentRepository.existsByName("Infraestrutura")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> departmentValidationService.validateDepartmentNameAlreadyExists("Infraestrutura"));
	}

	@Test
	void shouldNotThrowExceptionWhenUpdatingWithSameDepartmentName() {
		assertDoesNotThrow(
				() -> departmentValidationService.validateDepartmentNameForUpdate(department, "Infraestrutura"));
	}

	@Test
	void shouldNotThrowExceptionWhenUpdatingToAvailableDepartmentName() {

		when(departmentRepository.existsByName("Limpeza")).thenReturn(false);
		assertDoesNotThrow(() -> departmentValidationService.validateDepartmentNameForUpdate(department, "Limpeza"));
	}

	@Test
	void shouldThrowBusinessExceptionWhenUpdatingToExistingDepartmentName() {

		when(departmentRepository.existsByName("Limpeza")).thenReturn(true);
		assertThrows(BusinessException.class,
				() -> departmentValidationService.validateDepartmentNameForUpdate(department, "Limpeza"));
	}
}
