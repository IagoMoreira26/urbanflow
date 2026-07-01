package com.iagomoreira.urbanflow.dto.media;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.enums.MediaType;

public class MediaResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private MediaType type;
	private String url;
	private LocalDateTime uploadedAt;
	private String requestId;

	public MediaResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MediaType getType() {
		return type;
	}

	public void setType(MediaType type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public void setUploadedAt(LocalDateTime uploadedAt) {
		this.uploadedAt = uploadedAt;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
