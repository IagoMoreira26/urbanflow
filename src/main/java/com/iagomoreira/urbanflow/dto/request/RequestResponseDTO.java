package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private String userId;
	private String categoryId;
	private String subCategoryId;
	private PriorityLevel citizenPriority;
	private RequestStatus status;
	private Double latitude;
	private Double longitude;
	private AddressResponseDTO address;
	private String departmentId;
	private LocalDateTime createdAt;

	public RequestResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseDTO address) {
		this.address = address;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
