package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class UpdateCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String name;

	@NotBlank
	private String description;

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
}