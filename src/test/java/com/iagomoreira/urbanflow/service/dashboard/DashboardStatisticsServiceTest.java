package com.iagomoreira.urbanflow.service.dashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@ExtendWith(MockitoExtension.class)
class DashboardStatisticsServiceTest {

	@Mock
	private DashboardMetricsService metricsService;

	@Mock
	private DashboardMapper dashboardMapper;

	@InjectMocks
	private DashboardStatisticsService statisticsService;

	private DashboardStatisticsDTO statisticsDTO;
	private DashboardOverviewDTO overviewDTO;

	@BeforeEach
	void setUp() {
		statisticsDTO = new DashboardStatisticsDTO();
		statisticsDTO.setTotalRequests(100);
		statisticsDTO.setReceivedRequests(20);

		overviewDTO = new DashboardOverviewDTO();
		overviewDTO.setTotalRequests(100L);
		overviewDTO.setReceivedRequests(20L);
	}

	@Test
	void getStatistics_shouldCallMetricsAndMapper() {
		when(metricsService.countRequests()).thenReturn(100L);
		when(metricsService.countByStatus(RequestStatus.RECEIVED)).thenReturn(20L);
		when(metricsService.countByStatus(RequestStatus.IN_PROGRESS)).thenReturn(30L);
		when(metricsService.countByStatus(RequestStatus.RESOLVED)).thenReturn(40L);
		when(metricsService.countByStatus(RequestStatus.CANCELLED)).thenReturn(10L);
		when(metricsService.getResolutionRate()).thenReturn(40.0);
		when(metricsService.countUsers()).thenReturn(50L);
		when(metricsService.countVotes()).thenReturn(60L);
		when(metricsService.countFeedbacks()).thenReturn(25L);
		when(metricsService.getAverageRating()).thenReturn(4.2);

		when(dashboardMapper.toStatisticsResponse(100, 20, 30, 40, 10, 40.0, 50, 60, 25, 4.2))
				.thenReturn(statisticsDTO);

		DashboardStatisticsDTO result = statisticsService.getStatistics();

		assertEquals(statisticsDTO, result);

		verify(metricsService).countRequests();
		verify(metricsService).countByStatus(RequestStatus.RECEIVED);
		verify(metricsService).countByStatus(RequestStatus.IN_PROGRESS);
		verify(metricsService).countByStatus(RequestStatus.RESOLVED);
		verify(metricsService).countByStatus(RequestStatus.CANCELLED);
		verify(metricsService).getResolutionRate();
		verify(metricsService).countUsers();
		verify(metricsService).countVotes();
		verify(metricsService).countFeedbacks();
		verify(metricsService).getAverageRating();
		verify(dashboardMapper).toStatisticsResponse(100, 20, 30, 40, 10, 40.0, 50, 60, 25, 4.2);
	}

	@Test
	void getOverview_shouldCallMetricsAndMapper() {
		when(metricsService.countRequests()).thenReturn(100L);
		when(metricsService.countByStatus(RequestStatus.RECEIVED)).thenReturn(20L);
		when(metricsService.countByStatus(RequestStatus.UNDER_REVIEW)).thenReturn(5L);
		when(metricsService.countByStatus(RequestStatus.APPROVED)).thenReturn(8L);
		when(metricsService.countByStatus(RequestStatus.IN_PROGRESS)).thenReturn(30L);
		when(metricsService.countByStatus(RequestStatus.RESOLVED)).thenReturn(40L);
		when(metricsService.countByStatus(RequestStatus.CANCELLED)).thenReturn(10L);
		when(metricsService.countByStatus(RequestStatus.REJECTED)).thenReturn(3L);
		when(metricsService.countUsers()).thenReturn(50L);
		when(metricsService.countVotes()).thenReturn(60L);
		when(metricsService.getAverageRating()).thenReturn(4.2);

		when(dashboardMapper.toOverviewResponse(100L, 20L, 5L, 8L, 30L, 40L, 10L, 3L, 50L, 60L, 4.2))
				.thenReturn(overviewDTO);

		DashboardOverviewDTO result = statisticsService.getOverview();

		assertEquals(overviewDTO, result);

		verify(metricsService).countRequests();
		verify(metricsService).countByStatus(RequestStatus.RECEIVED);
		verify(metricsService).countByStatus(RequestStatus.UNDER_REVIEW);
		verify(metricsService).countByStatus(RequestStatus.APPROVED);
		verify(metricsService).countByStatus(RequestStatus.IN_PROGRESS);
		verify(metricsService).countByStatus(RequestStatus.RESOLVED);
		verify(metricsService).countByStatus(RequestStatus.CANCELLED);
		verify(metricsService).countByStatus(RequestStatus.REJECTED);
		verify(metricsService).countUsers();
		verify(metricsService).countVotes();
		verify(metricsService).getAverageRating();
		verify(dashboardMapper).toOverviewResponse(100L, 20L, 5L, 8L, 30L, 40L, 10L, 3L, 50L, 60L, 4.2);
	}
}