package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class DashboardStatisticsDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalRequests;
	private Integer receivedRequests;
	private Integer inProgressRequests;
	private Integer resolvedRequests;
	private Integer cancelledRequests;
	private Double resolutionRate;
	private Integer totalUsers;
	private Integer totalVotes;
	private Integer totalFeedbacks;
	private Double averageRating;

	public DashboardStatisticsDTO() {
	}

	public DashboardStatisticsDTO(Integer totalRequests, Integer receivedRequests, Integer inProgressRequests,
			Integer resolvedRequests, Integer cancelledRequests, Double resolutionRate, Integer totalUsers,
			Integer totalVotes, Integer totalFeedbacks, Double averageRating) {

		this.totalRequests = totalRequests;
		this.receivedRequests = receivedRequests;
		this.inProgressRequests = inProgressRequests;
		this.resolvedRequests = resolvedRequests;
		this.cancelledRequests = cancelledRequests;
		this.resolutionRate = resolutionRate;
		this.totalUsers = totalUsers;
		this.totalVotes = totalVotes;
		this.totalFeedbacks = totalFeedbacks;
		this.averageRating = averageRating;
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

	public Integer getTotalUsers() {
		return totalUsers;
	}

	public Integer getTotalVotes() {
		return totalVotes;
	}

	public Integer getTotalFeedbacks() {
		return totalFeedbacks;
	}

	public Double getAverageRating() {
		return averageRating;
	}
}