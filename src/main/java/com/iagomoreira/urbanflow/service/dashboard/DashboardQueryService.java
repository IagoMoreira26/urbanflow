package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;

@Service
public class DashboardQueryService {

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	public List<TopCategoryDTO> getTopCategories() {

		return requestRepository.findAll().stream()
				.collect(Collectors.groupingBy(Request::getCategoryId, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5).map(entry -> {

					Category category = categoryRepository.findById(entry.getKey()).orElse(null);

					return new TopCategoryDTO(entry.getKey(), category != null ? category.getName() : "Unknown",
							entry.getValue().intValue());

				}).toList();
	}

	public List<TopSubCategoryDTO> getTopSubCategories() {

		return requestRepository.findAll().stream()
				.collect(Collectors.groupingBy(Request::getSubCategoryId, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(5).map(entry -> {

					SubCategory subCategory = subCategoryRepository.findById(entry.getKey()).orElse(null);

					return new TopSubCategoryDTO(entry.getKey(),
							subCategory != null ? subCategory.getName() : "Unknown", entry.getValue().intValue());

				}).toList();
	}
}