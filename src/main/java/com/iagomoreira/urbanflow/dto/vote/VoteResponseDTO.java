package com.iagomoreira.urbanflow.dto.vote;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

public class VoteResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String userId;
	private String requestId;
	private PriorityLevel priorityLevel;
	private LocalDateTime createdAt;

	public VoteResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRequestId() {
		return requestId;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
