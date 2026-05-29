package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.dto.address.AddressResponseDTO;
import com.iagomoreira.urbanflow.model.Request;
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

	private LocalDateTime createdAt;

	public RequestResponseDTO() {
	}

	public RequestResponseDTO(Request request) {

		this.id = request.getId();
		this.title = request.getTitle();
		this.description = request.getDescription();
		this.userId = request.getUserId();
		this.categoryId = request.getCategoryId();
		this.subCategoryId = request.getSubCategoryId();
		this.citizenPriority = request.getCitizenPriority();
		this.status = request.getStatus();
		this.latitude = request.getLatitude();
		this.longitude = request.getLongitude();
		this.createdAt = request.getCreatedAt();

		if (request.getAddress() != null) {
			this.address = new AddressResponseDTO(request.getAddress());
		}
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

	public String getUserId() {
		return userId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public RequestStatus getStatus() {
		return status;
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
}
