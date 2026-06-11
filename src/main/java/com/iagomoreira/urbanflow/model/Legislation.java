package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Legislation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String title;
	private String description;
	private String documentUrl;

	private List<String> keywords = new ArrayList<>();

	public Legislation() {
	}

	public Legislation(String id, String title, String description, String documentUrl, List<String> keywords) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.documentUrl = documentUrl;
		this.keywords = keywords;
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
		Legislation other = (Legislation) obj;
		return Objects.equals(id, other.id);
	}
}
