package com.iagomoreira.urbanflow.dto.category;

import jakarta.validation.constraints.NotBlank;

public class UpdateCategoryDTO {

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	@NotBlank
	private String departmentId;

	public UpdateCategoryDTO() {
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

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
}