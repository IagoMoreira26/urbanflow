package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class TopSubCategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subCategoryId;
	private String subCategoryName;
	private Integer totalRequests;

	public TopSubCategoryDTO() {
	}

	public TopSubCategoryDTO(String subCategoryId, String subCategoryName, Integer totalRequests) {

		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.totalRequests = totalRequests;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}
}