package com.iagomoreira.urbanflow.dto.requesthistory;

import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.RequestHistory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

public class RequestHistoryResponseDTO {

	private String id;

	private RequestStatus oldStatus;

	private RequestStatus newStatus;

	private String changedBy;

	private String note;

	private LocalDateTime changedAt;

	public RequestHistoryResponseDTO(RequestHistory history) {

		this.id = history.getId();
		this.oldStatus = history.getOldStatus();
		this.newStatus = history.getNewStatus();
		this.changedBy = history.getChangedBy();
		this.note = history.getNote();
		this.changedAt = history.getChangedAt();
	}

	public String getId() {
		return id;
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
}