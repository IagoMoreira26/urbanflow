package com.iagomoreira.urbanflow.dto.subcategory;

import java.io.Serializable;

public class SubCategoryStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String subCategoryId;

	private String subCategoryName;

	private Integer totalRequests;

	private Integer receivedRequests;

	private Integer inProgressRequests;

	private Integer resolvedRequests;

	private Integer cancelledRequests;

	private Double resolutionRate;

	public SubCategoryStatisticsDTO() {
	}

	public SubCategoryStatisticsDTO(String subCategoryId, String subCategoryName, Integer totalRequests,
			Integer receivedRequests, Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests,
			Double resolutionRate) {

		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.totalRequests = totalRequests;
		this.receivedRequests = receivedRequests;
		this.inProgressRequests = inProgressRequests;
		this.resolvedRequests = resolvedRequests;
		this.cancelledRequests = cancelledRequests;
		this.resolutionRate = resolutionRate;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
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