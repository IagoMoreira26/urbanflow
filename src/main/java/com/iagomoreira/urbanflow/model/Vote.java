package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;

public class Vote implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private PriorityLevel priorityLevel;
	private LocalDateTime createdAt;
	private String userId;
	private String requestId;

	public Vote() {
	}

	public Vote(String id, PriorityLevel priorityLevel, LocalDateTime createdAt, String userId, String requestId) {
		super();
		this.id = id;
		this.priorityLevel = priorityLevel;
		this.createdAt = createdAt;
		this.userId = userId;
		this.requestId = requestId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
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

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vote other = (Vote) obj;
		return Objects.equals(id, other.id);
	}
}
