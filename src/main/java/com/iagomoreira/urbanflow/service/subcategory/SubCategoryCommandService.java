package com.iagomoreira.urbanflow.service.subcategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.SubCategoryResponseDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class SubCategoryCommandService {

	@Autowired
	private SubCategoryRepository repository;

	@Autowired
	private SubCategoryValidationService validationService;

	private SubCategory fromDTO(CreateSubCategoryDTO dto) {

		SubCategory subCategory = new SubCategory();

		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());

		return subCategory;
	}

	public SubCategoryResponseDTO create(CreateSubCategoryDTO dto) {

		validationService.validateCategoryExists(dto.getCategoryId());
		validationService.validateDepartmentExists(dto.getDepartmentId());

		SubCategory subCategory = repository.save(fromDTO(dto));

		return new SubCategoryResponseDTO(subCategory);
	}

	public SubCategoryResponseDTO update(String id, UpdateSubCategoryDTO dto) {

		SubCategory subCategory = validationService.validateSubCategoryExists(id);

		validationService.validateCategoryExists(dto.getCategoryId());
		validationService.validateDepartmentExists(dto.getDepartmentId());

		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());

		subCategory = repository.save(subCategory);

		return new SubCategoryResponseDTO(subCategory);
	}

	public void delete(String id) {

		validationService.validateSubCategoryExists(id);

		repository.deleteById(id);
	}
}