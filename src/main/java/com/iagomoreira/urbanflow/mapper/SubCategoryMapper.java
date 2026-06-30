package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.subcategory.CreateSubCategoryDTO;
import com.iagomoreira.urbanflow.dto.subcategory.UpdateSubCategoryDTO;
import com.iagomoreira.urbanflow.model.SubCategory;

@Component
public class SubCategoryMapper {

	public SubCategory toEntity(CreateSubCategoryDTO dto) {

		SubCategory subCategory = new SubCategory();

		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());

		return subCategory;
	}

	public void updateEntity(SubCategory subCategory, UpdateSubCategoryDTO dto) {
		subCategory.setName(dto.getName());
		subCategory.setDescription(dto.getDescription());
		subCategory.setCategoryId(dto.getCategoryId());
		subCategory.setDepartmentId(dto.getDepartmentId());
	}
}