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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/dashboard")
@Tag(name = "Dashboard", description = "Endpoints for dashboard statistics and overview")
public class DashboardController {

	private final DashboardService dashboardService;

	public DashboardController(DashboardService dashboardService) {
		this.dashboardService = dashboardService;
	}

	@GetMapping("/statistics")
	@Operation(summary = "Get general statistics", description = "Returns overall system statistics")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Statistics retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DashboardStatisticsDTO.class))) })
	public ResponseEntity<DashboardStatisticsDTO> getStatistics() {
		return ResponseEntity.ok(dashboardService.getStatistics());
	}

	@GetMapping("/top-categories")
	@Operation(summary = "Get top categories", description = "Returns the most used categories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Top categories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TopCategoryDTO.class))) })
	public ResponseEntity<List<TopCategoryDTO>> getTopCategories() {
		return ResponseEntity.ok(dashboardService.getTopCategories());
	}

	@GetMapping("/top-subcategories")
	@Operation(summary = "Get top subcategories", description = "Returns the most used subcategories")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Top subcategories retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = TopSubCategoryDTO.class))) })
	public ResponseEntity<List<TopSubCategoryDTO>> getTopSubCategories() {
		return ResponseEntity.ok(dashboardService.getTopSubCategories());
	}

	@PreAuthorize("hasAnyRole('ADMIN','OPERATOR')")
	@GetMapping("/overview")
	@Operation(summary = "Get dashboard overview", description = "Returns a comprehensive overview (admin/operator only)")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Overview retrieved", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DashboardOverviewDTO.class))),
			@ApiResponse(responseCode = "403", description = "Access denied", content = @Content) })
	public ResponseEntity<DashboardOverviewDTO> overview() {
		return ResponseEntity.ok(dashboardService.getOverview());
	}
}