package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

@Service
public class DashboardService {

	private final DashboardQueryService dashboardQueryService;
	private final DashboardStatisticsService dashboardStatisticsService;

	public DashboardService(DashboardQueryService dashboardQueryService,
			DashboardStatisticsService dashboardStatisticsService) {
		super();
		this.dashboardQueryService = dashboardQueryService;
		this.dashboardStatisticsService = dashboardStatisticsService;
	}

	public DashboardStatisticsDTO getStatistics() {
		return dashboardStatisticsService.getStatistics();
	}

	public DashboardOverviewDTO getOverview() {
		return dashboardStatisticsService.getOverview();
	}

	public List<TopCategoryDTO> getTopCategories() {
		return dashboardQueryService.getTopCategories();
	}

	public List<TopSubCategoryDTO> getTopSubCategories() {
		return dashboardQueryService.getTopSubCategories();
	}
}