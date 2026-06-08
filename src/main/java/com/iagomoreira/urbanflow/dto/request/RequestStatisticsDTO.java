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

	public RequestStatisticsDTO(Integer totalRequests, Integer receivedRequests, Integer inProgressRequests,
			Integer resolvedRequests, Integer cancelledRequests, Double resolutionRate) {

		this.totalRequests = totalRequests;
		this.receivedRequests = receivedRequests;
		this.inProgressRequests = inProgressRequests;
		this.resolvedRequests = resolvedRequests;
		this.cancelledRequests = cancelledRequests;
		this.resolutionRate = resolutionRate;
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