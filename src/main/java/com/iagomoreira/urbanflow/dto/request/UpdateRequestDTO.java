package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;

public class UpdateRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String title;

	@NotBlank
	private String description;

	public UpdateRequestDTO() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}