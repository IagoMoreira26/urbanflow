package com.iagomoreira.urbanflow.service.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryCommandService {

	@Autowired
	private CategoryRepository repository;

	@Autowired
	private CategoryValidationService validationService;

	private Category fromDTO(CreateCategoryDTO dto) {

		Category category = new Category();

		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());

		return category;
	}

	public CategoryResponseDTO create(CreateCategoryDTO dto) {

		validationService.validateDepartmentExists(dto.getDepartmentId());

		Category category = repository.save(fromDTO(dto));

		return new CategoryResponseDTO(category);
	}

	public CategoryResponseDTO update(String id, UpdateCategoryDTO dto) {

		Category category = validationService.validateCategoryExists(id);

		validationService.validateDepartmentExists(dto.getDepartmentId());

		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());

		category = repository.save(category);

		return new CategoryResponseDTO(category);
	}

	public void delete(String id) {

		validationService.validateCategoryExists(id);

		repository.deleteById(id);
	}
}
