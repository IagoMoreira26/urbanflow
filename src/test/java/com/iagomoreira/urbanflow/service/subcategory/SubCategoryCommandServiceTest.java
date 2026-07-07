package com.iagomoreira.urbanflow.service.subcategory;

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

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@ExtendWith(MockitoExtension.class)
class SubCategoryCommandServiceTest {

	@Mock
	private SubCategoryRepository subCategoryRepository;

	@Mock
	private SubCategoryValidationService subCategoryValidationService;

	@Mock
	private SubCategoryMapper subCategoryMapper;

	@InjectMocks
	private SubCategoryCommandService subCategoryCommandService;

	private SubCategory subCategory;
	private SubCategoryResponseDTO responseDTO;
	private CreateSubCategoryDTO createDTO;
	private UpdateSubCategoryDTO updateDTO;

	@BeforeEach
	void setUp() {

		createDTO = new CreateSubCategoryDTO();
		createDTO.setName("Buracos");
		createDTO.setDescription("Buracos em vias");
		createDTO.setCategoryId("category-id");
		createDTO.setDepartmentId("department-id");

		updateDTO = new UpdateSubCategoryDTO();
		updateDTO.setName("Buracos Atualizado");
		updateDTO.setDescription("Descrição Atualizada");
		updateDTO.setCategoryId("category-id");
		updateDTO.setDepartmentId("department-id");

		subCategory = new SubCategory();
		subCategory.setId("subcategory-id");
		subCategory.setName("Buracos");
		subCategory.setDescription("Buracos em vias");
		subCategory.setCategoryId("category-id");
		subCategory.setDepartmentId("department-id");

		responseDTO = new SubCategoryResponseDTO();
		responseDTO.setId("subcategory-id");
		responseDTO.setName("Buracos");
		responseDTO.setDescription("Buracos em vias");
		responseDTO.setCategoryId("category-id");
		responseDTO.setDepartmentId("department-id");
	}

	@Test
	void shouldCreateSubCategory() {

		doNothing().when(subCategoryValidationService).validateCategoryExists(createDTO.getCategoryId());
		doNothing().when(subCategoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());

		when(subCategoryMapper.toEntity(createDTO)).thenReturn(subCategory);
		when(subCategoryRepository.save(subCategory)).thenReturn(subCategory);
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		SubCategoryResponseDTO result = subCategoryCommandService.create(createDTO);

		assertEquals(responseDTO, result);

		verify(subCategoryValidationService).validateCategoryExists(createDTO.getCategoryId());
		verify(subCategoryValidationService).validateDepartmentExists(createDTO.getDepartmentId());
		verify(subCategoryMapper).toEntity(createDTO);
		verify(subCategoryRepository).save(subCategory);
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldUpdateSubCategory() {

		when(subCategoryValidationService.validateSubCategoryExists("subcategory-id")).thenReturn(subCategory);

		doNothing().when(subCategoryValidationService).validateCategoryExists(updateDTO.getCategoryId());
		doNothing().when(subCategoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());

		when(subCategoryRepository.save(subCategory)).thenReturn(subCategory);
		when(subCategoryMapper.toResponse(subCategory)).thenReturn(responseDTO);

		SubCategoryResponseDTO result = subCategoryCommandService.update("subcategory-id", updateDTO);

		assertEquals(responseDTO, result);

		verify(subCategoryValidationService).validateSubCategoryExists("subcategory-id");
		verify(subCategoryValidationService).validateCategoryExists(updateDTO.getCategoryId());
		verify(subCategoryValidationService).validateDepartmentExists(updateDTO.getDepartmentId());
		verify(subCategoryMapper).updateEntity(subCategory, updateDTO);
		verify(subCategoryRepository).save(subCategory);
		verify(subCategoryMapper).toResponse(subCategory);
	}

	@Test
	void shouldDeleteSubCategory() {

		when(subCategoryValidationService.validateSubCategoryExists("subcategory-id")).thenReturn(subCategory);
		subCategoryCommandService.delete("subcategory-id");

		verify(subCategoryValidationService).validateSubCategoryExists("subcategory-id");
		verify(subCategoryRepository).deleteById("subcategory-id");
	}
}