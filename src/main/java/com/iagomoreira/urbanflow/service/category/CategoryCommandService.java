package com.iagomoreira.urbanflow.service.category;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryCommandService {

	private final CategoryRepository categoryRepository;
	private final CategoryValidationService categoryValidationService;
	private final CategoryMapper categoryMapper;

	public CategoryCommandService(CategoryRepository categoryRepository,
			CategoryValidationService categoryValidationService, CategoryMapper categoryMapper) {

		this.categoryRepository = categoryRepository;
		this.categoryValidationService = categoryValidationService;
		this.categoryMapper = categoryMapper;
	}

	public CategoryResponseDTO create(CreateCategoryDTO dto) {

		categoryValidationService.validateDepartmentExists(dto.getDepartmentId());
		Category category = categoryMapper.toEntity(dto);

		category = categoryRepository.save(category);
		return new CategoryResponseDTO(category);
	}

	public CategoryResponseDTO update(String id, UpdateCategoryDTO dto) {

		Category category = categoryValidationService.validateCategoryExists(id);
		categoryValidationService.validateDepartmentExists(dto.getDepartmentId());

		categoryMapper.updateEntity(category, dto);

		category = categoryRepository.save(category);
		return new CategoryResponseDTO(category);
	}

	public void delete(String id) {
		categoryValidationService.validateCategoryExists(id);
		categoryRepository.deleteById(id);
	}
}