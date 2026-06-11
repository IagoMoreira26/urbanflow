package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Feedback implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private Integer rating;
	private String comment;
	private LocalDateTime createdAt;
	private String userId;
	private String requestId;

	public Feedback() {
	}

	public Feedback(String id, Integer rating, String comment, LocalDateTime createdAt, String userId,
			String requestId) {
		super();
		this.id = id;
		this.rating = rating;
		this.comment = comment;
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

	public String getRequestId() {
		return requestId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
		Feedback other = (Feedback) obj;
		return Objects.equals(id, other.id);
	}
}
