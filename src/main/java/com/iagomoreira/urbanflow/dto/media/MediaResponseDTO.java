package com.iagomoreira.urbanflow.dto.media;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iagomoreira.urbanflow.model.Media;
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

	public MediaResponseDTO(Media media) {

		this.id = media.getId();
		this.type = media.getType();
		this.url = media.getUrl();
		this.uploadedAt = media.getUploadedAt();
		this.requestId = media.getRequestId();
	}

	public String getId() {
		return id;
	}

	public MediaType getType() {
		return type;
	}

	public String getUrl() {
		return url;
	}

	public LocalDateTime getUploadedAt() {
		return uploadedAt;
	}

	public String getRequestId() {
		return requestId;
	}
}
