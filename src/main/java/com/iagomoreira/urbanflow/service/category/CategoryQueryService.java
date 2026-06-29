package com.iagomoreira.urbanflow.service.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryQueryService {

	@Autowired
	private CategoryRepository repository;

	@Autowired
	private CategoryValidationService validationService;

	public List<CategoryResponseDTO> findAll() {

		return repository.findAll().stream().map(CategoryResponseDTO::new).toList();
	}

	public CategoryResponseDTO findById(String id) {

		Category category = validationService.validateCategoryExists(id);

		return new CategoryResponseDTO(category);
	}
}