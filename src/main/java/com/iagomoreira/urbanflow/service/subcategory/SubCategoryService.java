package com.iagomoreira.urbanflow.service.subcategory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;

@Service
public class SubCategoryService {

	@Autowired
	private SubCategoryCommandService subCategoryCommandService;

	@Autowired
	private SubCategoryQueryService subCategoryQueryService;

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