package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;

@Service
public class SubCategoryService {

	private final SubCategoryCommandService subCategoryCommandService;
	private final SubCategoryQueryService subCategoryQueryService;

	public SubCategoryService(SubCategoryCommandService subCategoryCommandService,
			SubCategoryQueryService subCategoryQueryService) {
		super();
		this.subCategoryCommandService = subCategoryCommandService;
		this.subCategoryQueryService = subCategoryQueryService;
	}

	public SubCategoryResponseDTO create(CreateSubCategoryDTO dto) {
		return subCategoryCommandService.create(dto);
	}

	public List<SubCategoryResponseDTO> findAll() {
		return subCategoryQueryService.findAll();
	}

	public SubCategoryResponseDTO findById(String id) {
		return subCategoryQueryService.findById(id);
	}

	public List<SubCategoryResponseDTO> findByCategory(String categoryId) {
		return subCategoryQueryService.findByCategory(categoryId);
	}

	public SubCategoryResponseDTO update(String id, UpdateSubCategoryDTO dto) {
		return subCategoryCommandService.update(id, dto);
	}

	public void delete(String id) {
		subCategoryCommandService.delete(id);
	}
}