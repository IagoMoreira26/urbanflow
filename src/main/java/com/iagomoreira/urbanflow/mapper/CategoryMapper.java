package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.category.CreateCategoryDTO;
import com.iagomoreira.urbanflow.dto.category.UpdateCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;

@Component
public class CategoryMapper {

	public Category toEntity(CreateCategoryDTO dto) {

		Category category = new Category();

		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());

		return category;
	}

	public void updateEntity(Category category, UpdateCategoryDTO dto) {
		category.setName(dto.getName());
		category.setDescription(dto.getDescription());
		category.setDepartmentId(dto.getDepartmentId());
	}
}