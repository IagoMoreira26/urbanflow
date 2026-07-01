package com.iagomoreira.urbanflow.dto.update;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class UpdateResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private RequestStatus status;
	private String description;
	private LocalDateTime updatedAt;
	private String requestId;

	public UpdateResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}