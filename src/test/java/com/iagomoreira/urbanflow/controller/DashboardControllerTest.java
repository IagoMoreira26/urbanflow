package com.iagomoreira.urbanflow.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.iagomoreira.urbanflow.config.ControllerTestConfig;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardOverviewDTO;
import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.service.auth.TokenService;
import com.iagomoreira.urbanflow.service.dashboard.DashboardService;

@WebMvcTest(DashboardController.class)
@AutoConfigureMockMvc(addFilters = false)
@Import(ControllerTestConfig.class)
class DashboardControllerTest extends AbstractControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private DashboardService dashboardService;

	@MockitoBean
	private TokenService tokenService;

	@MockitoBean
	private UserDetailsService userDetailsService;

	private DashboardStatisticsDTO statisticsDTO;
	private List<TopCategoryDTO> topCategories;
	private List<TopSubCategoryDTO> topSubCategories;
	private DashboardOverviewDTO overviewDTO;

	private final String categoryId1 = "cat-1";
	private final String categoryId2 = "cat-2";
	private final String subCategoryId1 = "sub-1";
	private final String subCategoryId2 = "sub-2";

	@BeforeEach
	void setUp() {
		statisticsDTO = new DashboardStatisticsDTO();
		statisticsDTO.setTotalRequests(150);
		statisticsDTO.setReceivedRequests(30);
		statisticsDTO.setInProgressRequests(45);
		statisticsDTO.setResolvedRequests(60);
		statisticsDTO.setCancelledRequests(15);
		statisticsDTO.setResolutionRate(40.0);
		statisticsDTO.setTotalUsers(80);
		statisticsDTO.setTotalVotes(120);
		statisticsDTO.setTotalFeedbacks(45);
		statisticsDTO.setAverageRating(4.2);

		TopCategoryDTO top1 = new TopCategoryDTO();
		top1.setCategoryId(categoryId1);
		top1.setCategoryName("Infraestrutura");
		top1.setTotalRequests(50);

		TopCategoryDTO top2 = new TopCategoryDTO();
		top2.setCategoryId(categoryId2);
		top2.setCategoryName("Limpeza Urbana");
		top2.setTotalRequests(30);

		topCategories = List.of(top1, top2);

		TopSubCategoryDTO sub1 = new TopSubCategoryDTO();
		sub1.setSubCategoryId(subCategoryId1);
		sub1.setSubCategoryName("Pavimentação");
		sub1.setTotalRequests(25);

		TopSubCategoryDTO sub2 = new TopSubCategoryDTO();
		sub2.setSubCategoryId(subCategoryId2);
		sub2.setSubCategoryName("Coleta de Lixo");
		sub2.setTotalRequests(18);

		topSubCategories = List.of(sub1, sub2);

		overviewDTO = new DashboardOverviewDTO();
		overviewDTO.setTotalRequests(150L);
		overviewDTO.setReceivedRequests(30L);
		overviewDTO.setUnderReviewRequests(10L);
		overviewDTO.setApprovedRequests(5L);
		overviewDTO.setInProgressRequests(45L);
		overviewDTO.setResolvedRequests(60L);
		overviewDTO.setCancelledRequests(15L);
		overviewDTO.setRejectedRequests(5L);
		overviewDTO.setTotalUsers(80L);
		overviewDTO.setTotalVotes(120L);
		overviewDTO.setAverageRating(4.2);
	}

	@Test
	void shouldGetStatistics() throws Exception {
		when(dashboardService.getStatistics()).thenReturn(statisticsDTO);

		mockMvc.perform(get("/dashboard/statistics")).andExpect(status().isOk())
				.andExpect(jsonPath("$.totalRequests").value(150)).andExpect(jsonPath("$.receivedRequests").value(30))
				.andExpect(jsonPath("$.inProgressRequests").value(45))
				.andExpect(jsonPath("$.resolvedRequests").value(60))
				.andExpect(jsonPath("$.cancelledRequests").value(15))
				.andExpect(jsonPath("$.resolutionRate").value(40.0)).andExpect(jsonPath("$.totalUsers").value(80))
				.andExpect(jsonPath("$.totalVotes").value(120)).andExpect(jsonPath("$.totalFeedbacks").value(45))
				.andExpect(jsonPath("$.averageRating").value(4.2));

		verify(dashboardService).getStatistics();
	}

	@Test
	void shouldGetTopCategories() throws Exception {
		when(dashboardService.getTopCategories()).thenReturn(topCategories);

		mockMvc.perform(get("/dashboard/top-categories")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(2)).andExpect(jsonPath("$[0].categoryId").value(categoryId1))
				.andExpect(jsonPath("$[0].categoryName").value("Infraestrutura"))
				.andExpect(jsonPath("$[0].totalRequests").value(50))
				.andExpect(jsonPath("$[1].categoryId").value(categoryId2))
				.andExpect(jsonPath("$[1].categoryName").value("Limpeza Urbana"))
				.andExpect(jsonPath("$[1].totalRequests").value(30));

		verify(dashboardService).getTopCategories();
	}

	@Test
	void shouldGetTopSubCategories() throws Exception {
		when(dashboardService.getTopSubCategories()).thenReturn(topSubCategories);

		mockMvc.perform(get("/dashboard/top-subcategories")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()").value(2))
				.andExpect(jsonPath("$[0].subCategoryId").value(subCategoryId1))
				.andExpect(jsonPath("$[0].subCategoryName").value("Pavimentação"))
				.andExpect(jsonPath("$[0].totalRequests").value(25))
				.andExpect(jsonPath("$[1].subCategoryId").value(subCategoryId2))
				.andExpect(jsonPath("$[1].subCategoryName").value("Coleta de Lixo"))
				.andExpect(jsonPath("$[1].totalRequests").value(18));

		verify(dashboardService).getTopSubCategories();
	}

	@Test
	void shouldGetOverview() throws Exception {
		when(dashboardService.getOverview()).thenReturn(overviewDTO);

		mockMvc.perform(get("/dashboard/overview")).andExpect(status().isOk())
				.andExpect(jsonPath("$.totalRequests").value(150)).andExpect(jsonPath("$.receivedRequests").value(30))
				.andExpect(jsonPath("$.underReviewRequests").value(10))
				.andExpect(jsonPath("$.approvedRequests").value(5))
				.andExpect(jsonPath("$.inProgressRequests").value(45))
				.andExpect(jsonPath("$.resolvedRequests").value(60))
				.andExpect(jsonPath("$.cancelledRequests").value(15)).andExpect(jsonPath("$.rejectedRequests").value(5))
				.andExpect(jsonPath("$.totalUsers").value(80)).andExpect(jsonPath("$.totalVotes").value(120))
				.andExpect(jsonPath("$.averageRating").value(4.2));

		verify(dashboardService).getOverview();
	}
}