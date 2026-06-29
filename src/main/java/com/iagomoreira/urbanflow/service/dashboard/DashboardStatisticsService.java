package com.iagomoreira.urbanflow.service.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Service
public class DashboardStatisticsService {

	@Autowired
	private DashboardMetricsService metrics;

	public DashboardStatisticsDTO getStatistics() {

		return new DashboardStatisticsDTO(

				(int) metrics.countRequests(),

				(int) metrics.countByStatus(RequestStatus.RECEIVED),

				(int) metrics.countByStatus(RequestStatus.IN_PROGRESS),

				(int) metrics.countByStatus(RequestStatus.RESOLVED),

				(int) metrics.countByStatus(RequestStatus.CANCELLED),

				metrics.getResolutionRate(),

				(int) metrics.countUsers(),

				(int) metrics.countVotes(),

				(int) metrics.countFeedbacks(),

				metrics.getAverageRating());
	}

	public DashboardOverviewDTO getOverview() {

		return new DashboardOverviewDTO(

				metrics.countRequests(),

				metrics.countByStatus(RequestStatus.RECEIVED),

				metrics.countByStatus(RequestStatus.UNDER_REVIEW),

				metrics.countByStatus(RequestStatus.APPROVED),

				metrics.countByStatus(RequestStatus.IN_PROGRESS),

				metrics.countByStatus(RequestStatus.RESOLVED),

				metrics.countByStatus(RequestStatus.CANCELLED),

				metrics.countByStatus(RequestStatus.REJECTED),

				metrics.countUsers(),

				metrics.countVotes(),

				metrics.getAverageRating());
	}
}