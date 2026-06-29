package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class CreateCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Category name is required")
	private String name;

	@NotBlank(message = "Category description is required")
	private String description;

	@NotBlank
	private String departmentId;

	public CreateCategoryDTO() {
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}
