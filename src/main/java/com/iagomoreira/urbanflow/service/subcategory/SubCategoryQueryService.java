package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryQueryService {

	@Autowired
	private SubCategoryRepository repository;

	@Autowired
	private SubCategoryValidationService validationService;

	public List<SubCategoryResponseDTO> findAll() {

		return repository.findAll().stream().map(SubCategoryResponseDTO::new).toList();
	}

	public SubCategoryResponseDTO findById(String id) {

		return new SubCategoryResponseDTO(validationService.validateSubCategoryExists(id));
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {

		validationService.validateCategoryExists(categoryId);

		return repository.findByCategoryId(categoryId).stream().map(SubCategoryResponseDTO::new).toList();
	}
}