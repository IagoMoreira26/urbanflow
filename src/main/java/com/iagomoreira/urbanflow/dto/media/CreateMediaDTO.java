package com.iagomoreira.urbanflow.dto.media;

import java.io.Serializable;

import com.iagomoreira.urbanflow.model.enums.MediaType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateMediaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	private MediaType type;

	@NotBlank
	private String url;

	@NotBlank
	private String requestId;

	public CreateMediaDTO() {
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

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
