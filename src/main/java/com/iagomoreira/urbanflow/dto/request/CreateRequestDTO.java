package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;

import com.iagomoreira.urbanflow.dto.address.AddressDTO;
import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String title;

	@NotBlank
	private String description;

	@NotBlank
	private String categoryId;

	@NotBlank
	private String subCategoryId;

	@NotNull
	private PriorityLevel citizenPriority;

	@NotNull
	private Double latitude;

	@NotNull
	private Double longitude;

	@Valid
	private AddressDTO address;

	public CreateRequestDTO() {
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

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}
