package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryQueryService {

	private final SubCategoryRepository subCategoryRepository;
	private final SubCategoryValidationService subCategoryValidationService;
	private final SubCategoryMapper subCategoryMapper;

	public SubCategoryQueryService(SubCategoryRepository subCategoryRepository,
			SubCategoryValidationService subCategoryValidationService, SubCategoryMapper subCategoryMapper) {
		this.subCategoryRepository = subCategoryRepository;
		this.subCategoryValidationService = subCategoryValidationService;
		this.subCategoryMapper = subCategoryMapper;
	}

	public List<SubCategoryResponseDTO> findAll() {
		return subCategoryRepository.findAll().stream().map(subCategoryMapper::toResponse).toList();
	}

	public SubCategoryResponseDTO findById(String id) {
		SubCategory subCategory = subCategoryValidationService.validateSubCategoryExists(id);
		return subCategoryMapper.toResponse(subCategory);
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {
		subCategoryValidationService.validateCategoryExists(categoryId);
		return subCategoryRepository.findByCategoryId(categoryId).stream().map(subCategoryMapper::toResponse).toList();
	}
}