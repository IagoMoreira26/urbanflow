package com.iagomoreira.urbanflow.dto.request;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestFilterDTO {

	private RequestStatus status;
	private String categoryId;
	private String subCategoryId;
	private String userId;

	public RequestFilterDTO() {
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}