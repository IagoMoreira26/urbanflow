package com.iagomoreira.urbanflow.service.category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;

@Service
public class CategoryService {

	private final CategoryCommandService categoryCommandService;
	private final CategoryQueryService categoryQueryService;

	public CategoryService(CategoryCommandService categoryCommandService, CategoryQueryService categoryQueryService) {
		super();
		this.categoryCommandService = categoryCommandService;
		this.categoryQueryService = categoryQueryService;
	}

	public CategoryResponseDTO create(CreateCategoryDTO dto) {
		return categoryCommandService.create(dto);
	}

	public List<CategoryResponseDTO> findAll() {
		return categoryQueryService.findAll();
	}

	public CategoryResponseDTO findById(String id) {
		return categoryQueryService.findById(id);
	}

	public void delete(String id) {
		categoryCommandService.delete(id);
	}

	public CategoryResponseDTO update(String id, UpdateCategoryDTO dto) {
		return categoryCommandService.update(id, dto);
	}
}