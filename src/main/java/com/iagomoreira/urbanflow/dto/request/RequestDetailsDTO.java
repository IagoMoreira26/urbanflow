package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestDetailsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private RequestStatus status;
	private PriorityLevel citizenPriority;
	private Double latitude;
	private Double longitude;
	private AddressResponseDTO address;
	private LocalDateTime createdAt;
	private String categoryId;
	private String subCategoryId;
	private List<String> legislationIds;

	public RequestDetailsDTO() {
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

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
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

	public List<String> getLegislationIds() {
		return legislationIds;
	}

	public void setLegislationIds(List<String> legislationIds) {
		this.legislationIds = legislationIds;
	}
}