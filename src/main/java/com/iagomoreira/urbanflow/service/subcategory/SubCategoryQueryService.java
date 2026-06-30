package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryQueryService {

	private final SubCategoryRepository subCategoryRepository;
	private final SubCategoryValidationService subCategoryValidationService;

	public SubCategoryQueryService(SubCategoryRepository subCategoryRepository,
			SubCategoryValidationService subCategoryValidationService) {
		super();
		this.subCategoryRepository = subCategoryRepository;
		this.subCategoryValidationService = subCategoryValidationService;
	}

	public List<SubCategoryResponseDTO> findAll() {
		return subCategoryRepository.findAll().stream().map(SubCategoryResponseDTO::new).toList();
	}

	public SubCategoryResponseDTO findById(String id) {
		return new SubCategoryResponseDTO(subCategoryValidationService.validateSubCategoryExists(id));
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {
		subCategoryValidationService.validateCategoryExists(categoryId);
		return subCategoryRepository.findByCategoryId(categoryId).stream().map(SubCategoryResponseDTO::new).toList();
	}
}