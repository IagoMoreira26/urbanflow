package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;

@Service
public class DashboardService {

	@Autowired
	private DashboardQueryService queryService;

	@Autowired
	private DashboardStatisticsService statisticsService;

	public DashboardStatisticsDTO getStatistics() {
		return statisticsService.getStatistics();
	}

	public DashboardOverviewDTO getOverview() {
		return statisticsService.getOverview();
	}

	public List<TopCategoryDTO> getTopCategories() {
		return queryService.getTopCategories();
	}

	public List<TopSubCategoryDTO> getTopSubCategories() {
		return queryService.getTopSubCategories();
	}
}