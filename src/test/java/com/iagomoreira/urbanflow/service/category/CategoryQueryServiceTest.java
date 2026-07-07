package com.iagomoreira.urbanflow.service.category;

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

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@ExtendWith(MockitoExtension.class)
class CategoryQueryServiceTest {

	@Mock
	private CategoryRepository categoryRepository;

	@Mock
	private CategoryValidationService categoryValidationService;

	@Mock
	private CategoryMapper categoryMapper;

	@InjectMocks
	private CategoryQueryService categoryQueryService;

	private Category category;
	private CategoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		category = new Category();
		category.setId("category-id");
		category.setName("Iluminação");
		category.setDescription("Problemas relacionados à iluminação pública");
		category.setDepartmentId("department-id");

		responseDTO = new CategoryResponseDTO();
		responseDTO.setId("category-id");
		responseDTO.setName("Iluminação");
		responseDTO.setDescription("Problemas relacionados à iluminação pública");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldFindAllCategories() {

		when(categoryRepository.findAll()).thenReturn(List.of(category));
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		List<CategoryResponseDTO> result = categoryQueryService.findAll();

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(categoryRepository).findAll();
		verify(categoryMapper).toResponse(category);
	}

	@Test
	void shouldFindCategoryById() {

		when(categoryValidationService.validateCategoryExists("category-id")).thenReturn(category);
		when(categoryMapper.toResponse(category)).thenReturn(responseDTO);

		CategoryResponseDTO result = categoryQueryService.findById("category-id");
		assertEquals(responseDTO, result);

		verify(categoryValidationService).validateCategoryExists("category-id");
		verify(categoryMapper).toResponse(category);
	}
}