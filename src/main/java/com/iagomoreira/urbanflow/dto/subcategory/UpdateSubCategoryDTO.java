package com.iagomoreira.urbanflow.dto.subcategory;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class UpdateSubCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	@NotBlank
	private String categoryId;

	@NotBlank
	private String departmentId;

	public UpdateSubCategoryDTO() {
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

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}