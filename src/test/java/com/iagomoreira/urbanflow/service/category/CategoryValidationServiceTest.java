package com.iagomoreira.urbanflow.service.category;

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

import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
class CategoryValidationServiceTest {

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private CategoryValidationService categoryValidationService;

	private Category category;

	@BeforeEach
	void setup() {
		category = new Category();
		category.setId("1");
		category.setName("Iluminação Pública");
	}

	@Test
	void shouldReturnCategoryWhenCategoryExists() {

		when(categoryRepository.findById("1")).thenReturn(Optional.of(category));
		Category result = categoryValidationService.validateCategoryExists("1");
		assertEquals(category, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenCategoryDoesNotExist() {

		when(categoryRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class, () -> categoryValidationService.validateCategoryExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenDepartmentExists() {

		when(departmentRepository.existsById("10")).thenReturn(true);
		assertDoesNotThrow(() -> categoryValidationService.validateDepartmentExists("10"));
	}

	@Test
	void shouldThrowResourceNotFoundWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("10")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> categoryValidationService.validateDepartmentExists("10"));
	}

}