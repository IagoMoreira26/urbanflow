package com.iagomoreira.urbanflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.service.DashboardService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;

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
}