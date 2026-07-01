package com.iagomoreira.urbanflow.service.subcategory;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.SubCategoryMapper;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryCommandService {

	private final SubCategoryRepository subCategoryRepository;
	private final SubCategoryValidationService subCategoryValidationService;
	private final SubCategoryMapper subCategoryMapper;

	public SubCategoryCommandService(SubCategoryRepository subCategoryRepository,
			SubCategoryValidationService subCategoryValidationService, SubCategoryMapper subCategoryMapper) {

		this.subCategoryRepository = subCategoryRepository;
		this.subCategoryValidationService = subCategoryValidationService;
		this.subCategoryMapper = subCategoryMapper;
	}

	public SubCategoryResponseDTO create(CreateSubCategoryDTO dto) {

		subCategoryValidationService.validateCategoryExists(dto.getCategoryId());
		subCategoryValidationService.validateDepartmentExists(dto.getDepartmentId());

		SubCategory subCategory = subCategoryMapper.toEntity(dto);

		subCategory = subCategoryRepository.save(subCategory);
		return subCategoryMapper.toResponse(subCategory);
	}

	public SubCategoryResponseDTO update(String id, UpdateSubCategoryDTO dto) {

		SubCategory subCategory = subCategoryValidationService.validateSubCategoryExists(id);
		subCategoryValidationService.validateCategoryExists(dto.getCategoryId());
		subCategoryValidationService.validateDepartmentExists(dto.getDepartmentId());

		subCategoryMapper.updateEntity(subCategory, dto);

		subCategory = subCategoryRepository.save(subCategory);
		return subCategoryMapper.toResponse(subCategory);
	}

	public void delete(String id) {

		subCategoryValidationService.validateSubCategoryExists(id);
		subCategoryRepository.deleteById(id);
	}
}