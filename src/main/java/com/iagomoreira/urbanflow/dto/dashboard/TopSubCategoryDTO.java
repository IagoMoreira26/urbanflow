package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class TopSubCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subCategoryId;
	private String subCategoryName;
	private Integer totalRequests;

	public TopSubCategoryDTO() {
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}
}