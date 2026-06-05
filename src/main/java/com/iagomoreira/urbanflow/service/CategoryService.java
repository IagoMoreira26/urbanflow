package com.iagomoreira.urbanflow.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.category.CategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public CategoryResponseDTO create(CreateCategoryDTO dto) {

		Category category = fromDTO(dto);

		category = repository.save(category);

		return new CategoryResponseDTO(category);
	}

	public List<CategoryResponseDTO> findAll() {

		return repository.findAll().stream().map(CategoryResponseDTO::new).collect(Collectors.toList());
	}

	public CategoryResponseDTO findById(String id) {

		Category category = findEntityById(id);

		return new CategoryResponseDTO(category);
	}

	public void delete(String id) {

		findEntityById(id);

		repository.deleteById(id);
	}

	private Category findEntityById(String id) {

		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found"));
	}

	private Category fromDTO(CreateCategoryDTO dto) {

		Category category = new Category();

		category.setName(dto.getName());
		category.setDescription(dto.getDescription());

		return category;
	}
}
