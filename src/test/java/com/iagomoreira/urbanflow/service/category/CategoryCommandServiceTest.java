package com.iagomoreira.urbanflow.service.category;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@ExtendWith(MockitoExtension.class)
class CategoryCommandServiceTest {

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private CategoryValidationService categoryValidationService;

	@Mock
	private CategoryMapper categoryMapper;

	@InjectMocks
	private CategoryCommandService categoryCommandService;

	private Category category;
	private CategoryResponseDTO responseDTO;
	private CreateCategoryDTO createDTO;
	private UpdateCategoryDTO updateDTO;

	@BeforeEach
	void setUp() {

		createDTO = new CreateCategoryDTO();
		createDTO.setName("Infrastructure");
		createDTO.setDescription("Description");
		createDTO.setDepartmentId("department-id");

		updateDTO = new UpdateCategoryDTO();
		updateDTO.setName("Updated");
		updateDTO.setDescription("Updated Description");
		updateDTO.setDepartmentId("department-id");

		category = new Category();
		category.setId("category-id");
		category.setName("Infrastructure");
		category.setDescription("Description");
		category.setDepartmentId("department-id");

		responseDTO = new CategoryResponseDTO();
		responseDTO.setId("category-id");
		responseDTO.setName("Infrastructure");
		responseDTO.setDescription("Description");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldCreateCategory() {

		doNothing().when(categoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());

		when(categoryMapper.toEntity(createDTO)).thenReturn(category);
		when(categoryRepository.save(category)).thenReturn(category);
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		CategoryResponseDTO result = categoryCommandService.create(createDTO);

		assertEquals(responseDTO, result);

		verify(categoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());
		verify(categoryMapper).toEntity(createDTO);
		verify(categoryRepository).save(category);
		verify(categoryMapper).toResponse(category);
	}

	@Test
	void shouldUpdateCategory() {

		when(categoryValidationService.validateCategoryExists("category-id")).thenReturn(category);
		doNothing().when(categoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());

		when(categoryRepository.save(category)).thenReturn(category);
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		CategoryResponseDTO result = categoryCommandService.update("category-id", updateDTO);

		assertEquals(responseDTO, result);

		verify(categoryValidationService).validateCategoryExists("category-id");
		verify(categoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());
		verify(categoryMapper).updateEntity(category, updateDTO);
		verify(categoryRepository).save(category);
		verify(categoryMapper).toResponse(category);
	}

	@Test
	void shouldDeleteCategory() {

		when(categoryValidationService.validateCategoryExists("category-id")).thenReturn(category);
		categoryCommandService.delete("category-id");

		verify(categoryValidationService).validateCategoryExists("category-id");
		verify(categoryRepository).deleteById("category-id");
	}
}