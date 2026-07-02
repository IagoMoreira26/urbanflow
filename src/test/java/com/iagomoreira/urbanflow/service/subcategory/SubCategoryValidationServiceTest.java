package com.iagomoreira.urbanflow.service.subcategory;

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
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.DepartmentRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class SubCategoryValidationServiceTest {

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private SubCategoryValidationService subCategoryValidationService;

	private SubCategory subCategory;

	@BeforeEach
	void setup() {
		subCategory = new SubCategory();
		subCategory.setId("1");
		subCategory.setName("Buracos");
	}

	@Test
	void shouldReturnSubCategoryWhenSubCategoryExists() {

		when(subCategoryRepository.findById("1")).thenReturn(Optional.of(subCategory));
		SubCategory result = subCategoryValidationService.validateSubCategoryExists("1");
		assertEquals(subCategory, result);
	}

	@Test
	void shouldThrowResourceNotFoundWhenSubCategoryDoesNotExist() {

		when(subCategoryRepository.findById("1")).thenReturn(Optional.empty());
		assertThrows(ResourceNotFoundException.class,
				() -> subCategoryValidationService.validateSubCategoryExists("1"));
	}

	@Test
	void shouldNotThrowExceptionWhenCategoryExists() {

		when(categoryRepository.existsById("10")).thenReturn(true);
		assertDoesNotThrow(() -> subCategoryValidationService.validateCategoryExists("10"));
	}

	@Test
	void shouldThrowResourceNotFoundWhenCategoryDoesNotExist() {

		when(categoryRepository.existsById("10")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class, () -> subCategoryValidationService.validateCategoryExists("10"));
	}

	@Test
	void shouldNotThrowExceptionWhenDepartmentExists() {

		when(departmentRepository.existsById("20")).thenReturn(true);
		assertDoesNotThrow(() -> subCategoryValidationService.validateDepartmentExists("20"));
	}

	@Test
	void shouldThrowResourceNotFoundWhenDepartmentDoesNotExist() {

		when(departmentRepository.existsById("20")).thenReturn(false);
		assertThrows(ResourceNotFoundException.class,
				() -> subCategoryValidationService.validateDepartmentExists("20"));
	}
}