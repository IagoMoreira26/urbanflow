package com.iagomoreira.urbanflow.dto.vote;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateVoteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String requestId;

	@NotNull
	private PriorityLevel priorityLevel;

	public String getRequestId() {
		return requestId;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
}
