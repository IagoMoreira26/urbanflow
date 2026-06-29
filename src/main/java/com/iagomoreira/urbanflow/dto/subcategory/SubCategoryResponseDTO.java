package com.iagomoreira.urbanflow.dto.subcategory;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.SubCategory;

public class SubCategoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String description;
	private String categoryId;
	private String departmentId;

	public SubCategoryResponseDTO() {
	}

	public SubCategoryResponseDTO(SubCategory subCategory) {

		this.id = subCategory.getId();
		this.name = subCategory.getName();
		this.description = subCategory.getDescription();
		this.departmentId = subCategory.getDepartmentId();

		if (subCategory.getCategoryId() != null) {
			this.categoryId = subCategory.getCategoryId();
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public String getDepartmentId() {
		return departmentId;
	}
}
