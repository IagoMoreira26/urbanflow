package com.iagomoreira.urbanflow.dto.category;

import java.io.Serializable;

public class CategoryStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String categoryId;
	private String categoryName;
	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;

	public CategoryStatisticsDTO() {
	}

	public CategoryStatisticsDTO(String categoryId, String categoryName, Integer totalRequests,
			Integer receivedRequests, Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests,
			Double resolutionRate) {

		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.totalRequests = totalRequests;
		this.receivedRequests = receivedRequests;
		this.inProgressRequests = inProgressRequests;
		this.resolvedRequests = resolvedRequests;
		this.cancelledRequests = cancelledRequests;
		this.resolutionRate = resolutionRate;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public Integer getReceivedRequests() {
		return receivedRequests;
	}

	public Integer getInProgressRequests() {
		return inProgressRequests;
	}

	public Integer getResolvedRequests() {
		return resolvedRequests;
	}

	public Integer getCancelledRequests() {
		return cancelledRequests;
	}

	public Double getResolutionRate() {
		return resolutionRate;
	}
}