package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.Request;
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

	public RequestDetailsDTO(Request request) {

		this.id = request.getId();
		this.title = request.getTitle();
		this.description = request.getDescription();

		this.status = request.getStatus();

		this.citizenPriority = request.getCitizenPriority();

		this.latitude = request.getLatitude();
		this.longitude = request.getLongitude();

		this.createdAt = request.getCreatedAt();

		this.categoryId = request.getCategoryId();
		this.subCategoryId = request.getSubCategoryId();

		if (request.getAddress() != null) {
			this.address = new AddressResponseDTO(request.getAddress());
		}

		this.legislationIds = request.getLegislationIds();
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public AddressResponseDTO getAddress() {
		return address;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public List<String> getLegislationIds() {
		return legislationIds;
	}
}