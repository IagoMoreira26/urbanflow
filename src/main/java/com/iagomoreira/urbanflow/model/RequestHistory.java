package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Document(collection = "request_history")
public class RequestHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String requestId;

	private RequestStatus oldStatus;

	private RequestStatus newStatus;

	private String changedBy;

	private String note;

	private LocalDateTime changedAt;

	public RequestHistory() {
	}

	public RequestHistory(String id, String requestId, RequestStatus oldStatus, RequestStatus newStatus,
			String changedBy, String note, LocalDateTime changedAt) {

		this.id = id;
		this.requestId = requestId;
		this.oldStatus = oldStatus;
		this.newStatus = newStatus;
		this.changedBy = changedBy;
		this.note = note;
		this.changedAt = changedAt;
	}

	public String getId() {
		return id;
	}

	public String getRequestId() {
		return requestId;
	}

	public RequestStatus getOldStatus() {
		return oldStatus;
	}

	public RequestStatus getNewStatus() {
		return newStatus;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public String getNote() {
		return note;
	}

	public LocalDateTime getChangedAt() {
		return changedAt;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public void setOldStatus(RequestStatus oldStatus) {
		this.oldStatus = oldStatus;
	}

	public void setNewStatus(RequestStatus newStatus) {
		this.newStatus = newStatus;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
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
		RequestHistory other = (RequestHistory) obj;
		return Objects.equals(id, other.id);
	}
}