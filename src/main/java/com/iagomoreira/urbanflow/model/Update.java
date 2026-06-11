package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class Update implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private RequestStatus status;
	private String description;
	private LocalDateTime updatedAt;
	private String requestId;

	public Update() {
	}

	public Update(String id, RequestStatus status, String description, LocalDateTime updatedAt, String requestId) {
		super();
		this.id = id;
		this.status = status;
		this.description = description;
		this.updatedAt = updatedAt;
		this.requestId = requestId;
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
		Update other = (Update) obj;
		return Objects.equals(id, other.id);
	}
}
