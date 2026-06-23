package com.iagomoreira.urbanflow.dto.request;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

import jakarta.validation.constraints.NotNull;

public class UpdateRequestStatusDTO {

	@NotNull(message = "Status is required")
	private RequestStatus status;

	private String note;

	public UpdateRequestStatusDTO() {
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}