package com.iagomoreira.urbanflow.dto.feedback;

import java.io.Serializable;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateFeedbackDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Min(1)
	@Max(5)
	private Integer rating;

	@Size(max = 500)
	private String comment;

	@NotBlank
	private String userId;

	@NotBlank
	private String requestId;

	public CreateFeedbackDTO() {
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
