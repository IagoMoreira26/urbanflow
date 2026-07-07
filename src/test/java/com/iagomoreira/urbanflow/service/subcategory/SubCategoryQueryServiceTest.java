package com.iagomoreira.urbanflow.service.subcategory;

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

import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class SubCategoryQueryServiceTest {

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private SubCategoryValidationService subCategoryValidationService;

	@Mock
	private SubCategoryMapper subCategoryMapper;

	@InjectMocks
	private SubCategoryQueryService subCategoryQueryService;

	private SubCategory subCategory;
	private SubCategoryResponseDTO responseDTO;

	@BeforeEach
	void setUp() {

		subCategory = new SubCategory();
		subCategory.setId("subcategory-id");
		subCategory.setName("Buraco");
		subCategory.setDescription("Buracos em vias públicas");
		subCategory.setCategoryId("category-id");
		subCategory.setDepartmentId("department-id");

		responseDTO = new SubCategoryResponseDTO();
		responseDTO.setId("subcategory-id");
		responseDTO.setName("Buraco");
		responseDTO.setDescription("Buracos em vias públicas");
		responseDTO.setCategoryId("category-id");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldFindAllSubCategories() {

		when(subCategoryRepository.findAll()).thenReturn(List.of(subCategory));
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		List<SubCategoryResponseDTO> result = subCategoryQueryService.findAll();

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(subCategoryRepository).findAll();
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldFindSubCategoryById() {

		when(subCategoryValidationService.validateSubCategoryExists("subcategory-id")).thenReturn(subCategory);
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		SubCategoryResponseDTO result = subCategoryQueryService.findById("subcategory-id");
		assertEquals(responseDTO, result);

		verify(subCategoryValidationService).validateSubCategoryExists("subcategory-id");
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldFindSubCategoriesByCategory() {

		when(subCategoryRepository.findByCategoryId("category-id")).thenReturn(List.of(subCategory));
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		List<SubCategoryResponseDTO> result = subCategoryQueryService.findByCategory("category-id");

		assertEquals(1, result.size());
		assertEquals(responseDTO, result.get(0));

		verify(subCategoryValidationService).validateCategoryExists("category-id");
		verify(subCategoryRepository).findByCategoryId("category-id");
		verify(subCategoryMapper).toResponse(subCategory);
	}
}