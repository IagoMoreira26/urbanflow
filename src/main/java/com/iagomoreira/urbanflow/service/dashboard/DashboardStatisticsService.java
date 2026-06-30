package com.iagomoreira.urbanflow.service.dashboard;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Service
public class DashboardStatisticsService {

	private final DashboardMetricsService dashboardMetricsService;

	public DashboardStatisticsService(DashboardMetricsService dashboardMetricsService) {
		super();
		this.dashboardMetricsService = dashboardMetricsService;
	}

	public DashboardStatisticsDTO getStatistics() {

		return new DashboardStatisticsDTO(

				(int) dashboardMetricsService.countRequests(),
				(int) dashboardMetricsService.countByStatus(RequestStatus.RECEIVED),
				(int) dashboardMetricsService.countByStatus(RequestStatus.IN_PROGRESS),
				(int) dashboardMetricsService.countByStatus(RequestStatus.RESOLVED),
				(int) dashboardMetricsService.countByStatus(RequestStatus.CANCELLED),

				dashboardMetricsService.getResolutionRate(), (int) dashboardMetricsService.countUsers(),
				(int) dashboardMetricsService.countVotes(), (int) dashboardMetricsService.countFeedbacks(),

				dashboardMetricsService.getAverageRating());
	}

	public DashboardOverviewDTO getOverview() {

		return new DashboardOverviewDTO(

				dashboardMetricsService.countRequests(), dashboardMetricsService.countByStatus(RequestStatus.RECEIVED),
				dashboardMetricsService.countByStatus(RequestStatus.UNDER_REVIEW),
				dashboardMetricsService.countByStatus(RequestStatus.APPROVED),
				dashboardMetricsService.countByStatus(RequestStatus.IN_PROGRESS),
				dashboardMetricsService.countByStatus(RequestStatus.RESOLVED),
				dashboardMetricsService.countByStatus(RequestStatus.CANCELLED),
				dashboardMetricsService.countByStatus(RequestStatus.REJECTED),

				dashboardMetricsService.countUsers(), dashboardMetricsService.countVotes(),
				dashboardMetricsService.getAverageRating());
	}
}