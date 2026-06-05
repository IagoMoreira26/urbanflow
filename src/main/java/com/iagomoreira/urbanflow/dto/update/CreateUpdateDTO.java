package com.iagomoreira.urbanflow.dto.update;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateUpdateDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private RequestStatus status;

	@NotBlank
	private String description;

	@NotBlank
	private String requestId;

	public CreateUpdateDTO() {
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

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}