package com.iagomoreira.urbanflow.dto.request;

import java.io.Serializable;

public class RequestStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;

	public RequestStatisticsDTO() {
	}

	public Integer getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Integer totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Integer getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Integer receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Integer getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Integer inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Integer getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Integer resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Integer getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Integer cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Double getResolutionRate() {
		return resolutionRate;
	}

	public void setResolutionRate(Double resolutionRate) {
		this.resolutionRate = resolutionRate;
	}
}