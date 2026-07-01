package com.iagomoreira.urbanflow.dto.requesthistory;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestHistoryResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private RequestStatus oldStatus;
	private RequestStatus newStatus;
	private String changedBy;
	private String note;
	private LocalDateTime changedAt;

	public RequestHistoryResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestStatus getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(RequestStatus oldStatus) {
		this.oldStatus = oldStatus;
	}

	public RequestStatus getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(RequestStatus newStatus) {
		this.newStatus = newStatus;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDateTime getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(LocalDateTime changedAt) {
		this.changedAt = changedAt;
	}
}