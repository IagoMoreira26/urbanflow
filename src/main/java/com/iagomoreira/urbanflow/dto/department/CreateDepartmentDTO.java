package com.iagomoreira.urbanflow.dto.department;

import jakarta.validation.constraints.NotBlank;

public class CreateDepartmentDTO {

	@NotBlank
	private String name;

	@NotBlank
	private String description;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}