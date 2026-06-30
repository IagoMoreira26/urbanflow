package com.iagomoreira.urbanflow.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryQueryService {

	private final CategoryRepository categoryRepository;
	private final CategoryValidationService categoryValidationService;

	public CategoryQueryService(CategoryRepository categoryRepository, CategoryValidationService categoryValidationService) {
		super();
		this.categoryRepository = categoryRepository;
		this.categoryValidationService = categoryValidationService;
	}

	public List<CategoryResponseDTO> findAll() {
		return categoryRepository.findAll().stream().map(CategoryResponseDTO::new).toList();
	}

	public CategoryResponseDTO findById(String id) {

		Category category = categoryValidationService.validateCategoryExists(id);
		return new CategoryResponseDTO(category);
	}
}