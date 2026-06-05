package com.iagomoreira.urbanflow.dto.legislation;

import java.io.Serializable;
import java.util.List;

import com.iagomoreira.urbanflow.model.Legislation;

public class LegislationResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String description;
	private String documentUrl;
	private List<String> keywords;

	public LegislationResponseDTO() {
	}

	public LegislationResponseDTO(Legislation legislation) {
		this.id = legislation.getId();
		this.title = legislation.getTitle();
		this.description = legislation.getDescription();
		this.documentUrl = legislation.getDocumentUrl();
		this.keywords = legislation.getKeywords();
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getDocumentUrl() {
		return documentUrl;
	}

	public List<String> getKeywords() {
		return keywords;
	}
}
