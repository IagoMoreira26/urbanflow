package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class TopCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryId;
	private String categoryName;
	private Integer totalRequests;

	public TopCategoryDTO() {
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}
}