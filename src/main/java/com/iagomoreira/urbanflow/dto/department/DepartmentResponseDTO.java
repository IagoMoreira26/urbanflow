package com.iagomoreira.urbanflow.dto.department;

import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.Department;

public class DepartmentResponseDTO {

	private String id;

	private String name;

	private String description;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	public DepartmentResponseDTO(Department department) {

		this.id = department.getId();
		this.name = department.getName();
		this.description = department.getDescription();
		this.createdAt = department.getCreatedAt();
		this.updatedAt = department.getUpdatedAt();
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
}