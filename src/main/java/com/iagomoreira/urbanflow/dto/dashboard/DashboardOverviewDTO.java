package com.iagomoreira.urbanflow.dto.dashboard;

import java.io.Serializable;

public class DashboardOverviewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long totalRequests;
	private Long receivedRequests;
	private Long underReviewRequests;
	private Long approvedRequests;
	private Long inProgressRequests;
	private Long resolvedRequests;
	private Long cancelledRequests;
	private Long rejectedRequests;
	private Long totalUsers;
	private Long totalVotes;

	private Double averageRating;

	public DashboardOverviewDTO() {
	}

	public DashboardOverviewDTO(Long totalRequests, Long receivedRequests, Long underReviewRequests,
			Long approvedRequests, Long inProgressRequests, Long resolvedRequests, Long cancelledRequests,
			Long rejectedRequests, Long totalUsers, Long totalVotes, Double averageRating) {
		super();
		this.totalRequests = totalRequests;
		this.receivedRequests = receivedRequests;
		this.underReviewRequests = underReviewRequests;
		this.approvedRequests = approvedRequests;
		this.inProgressRequests = inProgressRequests;
		this.resolvedRequests = resolvedRequests;
		this.cancelledRequests = cancelledRequests;
		this.rejectedRequests = rejectedRequests;
		this.totalUsers = totalUsers;
		this.totalVotes = totalVotes;
		this.averageRating = averageRating;
	}

	public Long getTotalRequests() {
		return totalRequests;
	}

	public Long getReceivedRequests() {
		return receivedRequests;
	}

	public Long getUnderReviewRequests() {
		return underReviewRequests;
	}

	public Long getApprovedRequests() {
		return approvedRequests;
	}

	public Long getInProgressRequests() {
		return inProgressRequests;
	}

	public Long getResolvedRequests() {
		return resolvedRequests;
	}

	public Long getCancelledRequests() {
		return cancelledRequests;
	}

	public Long getRejectedRequests() {
		return rejectedRequests;
	}

	public Long getTotalUsers() {
		return totalUsers;
	}

	public Long getTotalVotes() {
		return totalVotes;
	}

	public Double getAverageRating() {
		return averageRating;
	}
}
