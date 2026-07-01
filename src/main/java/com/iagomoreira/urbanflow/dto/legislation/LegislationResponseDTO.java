package com.iagomoreira.urbanflow.dto.legislation;

import java.io.Serializable;
import java.util.List;

public class LegislationResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private String documentUrl;
	private List<String> keywords;

	public LegislationResponseDTO() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDocumentUrl() {
		return documentUrl;
	}

	public void setDocumentUrl(String documentUrl) {
		this.documentUrl = documentUrl;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}
