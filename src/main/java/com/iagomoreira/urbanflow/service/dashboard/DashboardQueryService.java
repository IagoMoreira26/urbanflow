package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.mapper.DashboardMapper;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class DashboardQueryService {

	private final RequestRepository requestRepository;
	private final CategoryRepository categoryRepository;
	private final SubCategoryRepository subCategoryRepository;
	private final DashboardMapper dashboardMapper;

	public DashboardQueryService(RequestRepository requestRepository, CategoryRepository categoryRepository,
			SubCategoryRepository subCategoryRepository, DashboardMapper dashboardMapper) {
		super();
		this.requestRepository = requestRepository;
		this.categoryRepository = categoryRepository;
		this.subCategoryRepository = subCategoryRepository;
		this.dashboardMapper = dashboardMapper;
	}

	public List<TopCategoryDTO> getTopCategories() {
		return requestRepository.findAll().stream()
				.collect(Collectors.groupingBy(Request::getCategoryId, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5).map(entry -> {
					Category category = categoryRepository.findById(entry.getKey()).orElse(null);
					String categoryName = category != null ? category.getName() : "Unknown";
					return dashboardMapper.toTopCategoryResponse(entry.getKey(), categoryName,
							entry.getValue().intValue());
				}).toList();
	}

	public List<TopSubCategoryDTO> getTopSubCategories() {
		return requestRepository.findAll().stream()
				.collect(Collectors.groupingBy(Request::getSubCategoryId, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5).map(entry -> {
					SubCategory subCategory = subCategoryRepository.findById(entry.getKey()).orElse(null);
					String subCategoryName = subCategory != null ? subCategory.getName() : "Unknown";
					return dashboardMapper.toTopSubCategoryResponse(entry.getKey(), subCategoryName,
							entry.getValue().intValue());
				}).toList();
	}
}