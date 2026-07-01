package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

public class CategoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String description;
	private String departmentId;

	public CategoryResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
