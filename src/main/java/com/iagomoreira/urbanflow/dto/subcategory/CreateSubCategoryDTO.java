package com.iagomoreira.urbanflow.dto.subcategory;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class CreateSubCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Subcategory name is required")
	private String name;

	@NotBlank(message = "Subcategory description is required")
	private String description;

	@NotBlank(message = "Category id is required")
	private String categoryId;

	public CreateSubCategoryDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
