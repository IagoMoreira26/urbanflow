package com.iagomoreira.urbanflow.dto.update;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.Update;
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

	public UpdateResponseDTO(Update update) {

		this.id = update.getId();
		this.status = update.getStatus();
		this.description = update.getDescription();
		this.updatedAt = update.getUpdatedAt();
		this.requestId = update.getRequestId();
	}

	public String getId() {
		return id;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public String getRequestId() {
		return requestId;
	}
}