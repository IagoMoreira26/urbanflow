package com.iagomoreira.urbanflow.dto.vote;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateVoteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String userId;

	@NotBlank
	private String requestId;

	@NotNull
	private PriorityLevel priorityLevel;

	public String getUserId() {
		return userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
}
