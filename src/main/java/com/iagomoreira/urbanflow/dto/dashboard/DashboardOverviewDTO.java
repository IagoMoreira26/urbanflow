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

	public Long getTotalRequests() {
		return totalRequests;
	}

	public void setTotalRequests(Long totalRequests) {
		this.totalRequests = totalRequests;
	}

	public Long getReceivedRequests() {
		return receivedRequests;
	}

	public void setReceivedRequests(Long receivedRequests) {
		this.receivedRequests = receivedRequests;
	}

	public Long getUnderReviewRequests() {
		return underReviewRequests;
	}

	public void setUnderReviewRequests(Long underReviewRequests) {
		this.underReviewRequests = underReviewRequests;
	}

	public Long getApprovedRequests() {
		return approvedRequests;
	}

	public void setApprovedRequests(Long approvedRequests) {
		this.approvedRequests = approvedRequests;
	}

	public Long getInProgressRequests() {
		return inProgressRequests;
	}

	public void setInProgressRequests(Long inProgressRequests) {
		this.inProgressRequests = inProgressRequests;
	}

	public Long getResolvedRequests() {
		return resolvedRequests;
	}

	public void setResolvedRequests(Long resolvedRequests) {
		this.resolvedRequests = resolvedRequests;
	}

	public Long getCancelledRequests() {
		return cancelledRequests;
	}

	public void setCancelledRequests(Long cancelledRequests) {
		this.cancelledRequests = cancelledRequests;
	}

	public Long getRejectedRequests() {
		return rejectedRequests;
	}

	public void setRejectedRequests(Long rejectedRequests) {
		this.rejectedRequests = rejectedRequests;
	}

	public Long getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Long totalUsers) {
		this.totalUsers = totalUsers;
	}

	public Long getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(Long totalVotes) {
		this.totalVotes = totalVotes;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

}
