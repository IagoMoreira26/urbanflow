package com.iagomoreira.urbanflow.dto.department;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class CreateDepartmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

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