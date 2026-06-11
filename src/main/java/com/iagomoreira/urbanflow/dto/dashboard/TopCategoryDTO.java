package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class TopCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryId;
	private String categoryName;
	private Integer totalRequests;

	public TopCategoryDTO() {
	}

	public TopCategoryDTO(String categoryId, String categoryName, Integer totalRequests) {

		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.totalRequests = totalRequests;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}
}