package com.iagomoreira.urbanflow.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.iagomoreira.urbanflow.model.enums.PriorityLevel;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Document(collection = "requests")
public class Request implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private User user;
	private String title;
	private String description;
	private LocalDateTime createdAt;
	private Category category;
	private SubCategory subCategory;
	private RequestStatus status;
	private PriorityLevel citizenPriority;

	private Double latitude;
	private Double longitude;

	private Address address;

	private List<Legislation> legislations = new ArrayList<>();

	public Request() {
	}

	public Request(String id, User user, String title, String description, LocalDateTime createdAt, Category category,
			SubCategory subCategory, RequestStatus status, PriorityLevel citizenPriority, Double latitude,
			Double longitude, Address address, List<Legislation> legislations) {
		super();
		this.id = id;
		this.user = user;
		this.title = title;
		this.description = description;
		this.createdAt = createdAt;
		this.category = category;
		this.subCategory = subCategory;
		this.status = status;
		this.citizenPriority = citizenPriority;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.legislations = legislations;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public PriorityLevel getCitizenPriority() {
		return citizenPriority;
	}

	public void setCitizenPriority(PriorityLevel citizenPriority) {
		this.citizenPriority = citizenPriority;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Legislation> getLegislations() {
		return legislations;
	}

	public void setLegislations(List<Legislation> legislations) {
		this.legislations = legislations;
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
		Request other = (Request) obj;
		return Objects.equals(id, other.id);
	}
}
