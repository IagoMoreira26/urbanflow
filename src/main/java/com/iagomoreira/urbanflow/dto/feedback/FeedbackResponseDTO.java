package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.Feedback;

public class FeedbackResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private Integer rating;
	private String comment;
	private LocalDateTime createdAt;
	private String userId;
	private String requestId;

	public FeedbackResponseDTO() {
	}

	public FeedbackResponseDTO(Feedback feedback) {
		this.id = feedback.getId();
		this.rating = feedback.getRating();
		this.comment = feedback.getComment();
		this.createdAt = feedback.getCreatedAt();
		this.userId = feedback.getUserId();
		this.requestId = feedback.getRequestId();
	}

	public String getId() {
		return id;
	}

	public Integer getRating() {
		return rating;
	}

	public String getComment() {
		return comment;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public String getUserId() {
		return userId;
	}

	public String getRequestId() {
		return requestId;
	}
}
