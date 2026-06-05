package com.iagomoreira.urbanflow.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryService {

	@Autowired
	private SubCategoryRepository repository;

	@Autowired
	private CategoryRepository categoryRepository;

	public SubCategoryResponseDTO create(CreateSubCategoryDTO dto) {

		validateCategory(dto.getCategoryId());

		SubCategory subCategory = fromDTO(dto);

		subCategory = repository.save(subCategory);

		return new SubCategoryResponseDTO(subCategory);
	}

	public List<SubCategoryResponseDTO> findAll() {

		return repository.findAll().stream().map(SubCategoryResponseDTO::new).collect(Collectors.toList());
	}

	public SubCategoryResponseDTO findById(String id) {

		SubCategory subCategory = findEntityById(id);

		return new SubCategoryResponseDTO(subCategory);
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {

		return repository.findByCategoryId(categoryId).stream().map(SubCategoryResponseDTO::new)
				.collect(Collectors.toList());
	}

	public void delete(String id) {

		findEntityById(id);

		repository.deleteById(id);
	}

	private void validateCategory(String categoryId) {

		if (!categoryRepository.existsById(categoryId)) {

			throw new ResourceNotFoundException("Category not found");
		}
	}

	private SubCategory findEntityById(String id) {

		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("SubCategory not found"));
	}

	private SubCategory fromDTO(CreateSubCategoryDTO dto) {

		SubCategory subCategory = new SubCategory();

		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());

		return subCategory;
	}
}
