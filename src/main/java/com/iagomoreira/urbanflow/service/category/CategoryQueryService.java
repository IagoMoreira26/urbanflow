package com.iagomoreira.urbanflow.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.CategoryMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryQueryService {

	private final CategoryRepository categoryRepository;
	private final CategoryValidationService categoryValidationService;
	private final CategoryMapper categoryMapper;

	public CategoryQueryService(CategoryRepository categoryRepository,
			CategoryValidationService categoryValidationService, CategoryMapper categoryMapper) {
		super();
		this.categoryRepository = categoryRepository;
		this.categoryValidationService = categoryValidationService;
		this.categoryMapper = categoryMapper;
	}

	public List<CategoryResponseDTO> findAll() {
		return categoryRepository.findAll().stream().map(categoryMapper::toResponse).toList();
	}

	public CategoryResponseDTO findById(String id) {

		Category category = categoryValidationService.validateCategoryExists(id);
		return categoryMapper.toResponse(category);
	}
}