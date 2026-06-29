package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.Category;

public class CategoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String description;
	private String departmentId;

	public CategoryResponseDTO() {
	}

	public CategoryResponseDTO(Category category) {
		this.id = category.getId();
		this.name = category.getName();
		this.description = category.getDescription();
		this.departmentId = category.getDepartmentId();
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
	
	public String getDepartmentId() {
	    return departmentId;
	}
}
