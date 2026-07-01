package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;
import java.time.LocalDateTime;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
}
