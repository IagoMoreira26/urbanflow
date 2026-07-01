package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

@Component
public class DashboardMapper {

	public DashboardStatisticsDTO toStatisticsResponse(Integer totalRequests, Integer receivedRequests,
			Integer inProgressRequests, Integer resolvedRequests, Integer cancelledRequests, Double resolutionRate,
			Integer totalUsers, Integer totalVotes, Integer totalFeedbacks, Double averageRating) {
		DashboardStatisticsDTO dto = new DashboardStatisticsDTO();
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setResolutionRate(resolutionRate);
		dto.setTotalUsers(totalUsers);
		dto.setTotalVotes(totalVotes);
		dto.setTotalFeedbacks(totalFeedbacks);
		dto.setAverageRating(averageRating);
		return dto;
	}

	public DashboardOverviewDTO toOverviewResponse(Long totalRequests, Long receivedRequests, Long underReviewRequests,
			Long approvedRequests, Long inProgressRequests, Long resolvedRequests, Long cancelledRequests,
			Long rejectedRequests, Long totalUsers, Long totalVotes, Double averageRating) {
		DashboardOverviewDTO dto = new DashboardOverviewDTO();
		dto.setTotalRequests(totalRequests);
		dto.setReceivedRequests(receivedRequests);
		dto.setUnderReviewRequests(underReviewRequests);
		dto.setApprovedRequests(approvedRequests);
		dto.setInProgressRequests(inProgressRequests);
		dto.setResolvedRequests(resolvedRequests);
		dto.setCancelledRequests(cancelledRequests);
		dto.setRejectedRequests(rejectedRequests);
		dto.setTotalUsers(totalUsers);
		dto.setTotalVotes(totalVotes);
		dto.setAverageRating(averageRating);
		return dto;
	}

	public TopCategoryDTO toTopCategoryResponse(String categoryId, String categoryName, Integer totalRequests) {
		TopCategoryDTO dto = new TopCategoryDTO();
		dto.setCategoryId(categoryId);
		dto.setCategoryName(categoryName);
		dto.setTotalRequests(totalRequests);
		return dto;
	}

	public TopSubCategoryDTO toTopSubCategoryResponse(String subCategoryId, String subCategoryName,
			Integer totalRequests) {
		TopSubCategoryDTO dto = new TopSubCategoryDTO();
		dto.setSubCategoryId(subCategoryId);
		dto.setSubCategoryName(subCategoryName);
		dto.setTotalRequests(totalRequests);
		return dto;
	}
}