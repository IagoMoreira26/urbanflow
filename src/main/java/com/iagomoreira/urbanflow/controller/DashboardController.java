package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.service.dashboard.DashboardService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	private final DashboardService dashboardService;

	public DashboardController(DashboardService dashboardService) {
		super();
		this.dashboardService = dashboardService;
	}

	@GetMapping("/statistics")
	public DashboardStatisticsDTO getStatistics() {
		return dashboardService.getStatistics();
	}

	@GetMapping("/top-categories")
	public List<TopCategoryDTO> getTopCategories() {
		return dashboardService.getTopCategories();
	}

	@GetMapping("/top-subcategories")
	public List<TopSubCategoryDTO> getTopSubCategories() {
		return dashboardService.getTopSubCategories();
	}

	@PreAuthorize("hasAnyRole('ADMIN','PUBLIC_AGENT')")
	@GetMapping("/overview")
	public ResponseEntity<DashboardOverviewDTO> overview() {
		return ResponseEntity.ok(dashboardService.getOverview());
	}
}