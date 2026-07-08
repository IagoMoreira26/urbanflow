package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

class DashboardMapperTest {

	private DashboardMapper dashboardMapper;

	@BeforeEach
	void setUp() {
		dashboardMapper = new DashboardMapper();
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		Integer totalRequests = 100;
		Integer receivedRequests = 20;
		Integer inProgressRequests = 30;
		Integer resolvedRequests = 40;
		Integer cancelledRequests = 10;
		Double resolutionRate = 40.0;
		Integer totalUsers = 50;
		Integer totalVotes = 60;
		Integer totalFeedbacks = 25;
		Double averageRating = 4.2;

		DashboardStatisticsDTO dto = dashboardMapper.toStatisticsResponse(totalRequests, receivedRequests,
				inProgressRequests, resolvedRequests, cancelledRequests, resolutionRate, totalUsers, totalVotes,
				totalFeedbacks, averageRating);

		assertNotNull(dto);
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(resolutionRate, dto.getResolutionRate());
		assertEquals(totalUsers, dto.getTotalUsers());
		assertEquals(totalVotes, dto.getTotalVotes());
		assertEquals(totalFeedbacks, dto.getTotalFeedbacks());
		assertEquals(averageRating, dto.getAverageRating());
	}

	@Test
	void toOverviewResponse_shouldMapAllFields() {
		Long totalRequests = 100L;
		Long receivedRequests = 20L;
		Long underReviewRequests = 5L;
		Long approvedRequests = 8L;
		Long inProgressRequests = 30L;
		Long resolvedRequests = 40L;
		Long cancelledRequests = 10L;
		Long rejectedRequests = 3L;
		Long totalUsers = 50L;
		Long totalVotes = 60L;
		Double averageRating = 4.2;

		DashboardOverviewDTO dto = dashboardMapper.toOverviewResponse(totalRequests, receivedRequests,
				underReviewRequests, approvedRequests, inProgressRequests, resolvedRequests, cancelledRequests,
				rejectedRequests, totalUsers, totalVotes, averageRating);

		assertNotNull(dto);
		assertEquals(totalRequests, dto.getTotalRequests());
		assertEquals(receivedRequests, dto.getReceivedRequests());
		assertEquals(underReviewRequests, dto.getUnderReviewRequests());
		assertEquals(approvedRequests, dto.getApprovedRequests());
		assertEquals(inProgressRequests, dto.getInProgressRequests());
		assertEquals(resolvedRequests, dto.getResolvedRequests());
		assertEquals(cancelledRequests, dto.getCancelledRequests());
		assertEquals(rejectedRequests, dto.getRejectedRequests());
		assertEquals(totalUsers, dto.getTotalUsers());
		assertEquals(totalVotes, dto.getTotalVotes());
		assertEquals(averageRating, dto.getAverageRating());
	}

	@Test
	void toTopCategoryResponse_shouldMapAllFields() {
		String categoryId = "cat-1";
		String categoryName = "Infraestrutura";
		Integer totalRequests = 50;

		TopCategoryDTO dto = dashboardMapper.toTopCategoryResponse(categoryId, categoryName, totalRequests);

		assertNotNull(dto);
		assertEquals(categoryId, dto.getCategoryId());
		assertEquals(categoryName, dto.getCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
	}

	@Test
	void toTopSubCategoryResponse_shouldMapAllFields() {
		String subCategoryId = "sub-1";
		String subCategoryName = "Pavimentação";
		Integer totalRequests = 25;

		TopSubCategoryDTO dto = dashboardMapper.toTopSubCategoryResponse(subCategoryId, subCategoryName, totalRequests);

		assertNotNull(dto);
		assertEquals(subCategoryId, dto.getSubCategoryId());
		assertEquals(subCategoryName, dto.getSubCategoryName());
		assertEquals(totalRequests, dto.getTotalRequests());
	}
}