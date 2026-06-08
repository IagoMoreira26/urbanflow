package com.iagomoreira.urbanflow.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.dashboard.DashboardStatisticsDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopCategoryDTO;
import com.iagomoreira.urbanflow.dto.dashboard.TopSubCategoryDTO;
import com.iagomoreira.urbanflow.model.Category;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.SubCategory;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.CategoryRepository;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.SubCategoryRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class DashboardService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VoteRepository voteRepository;

	@Autowired
	private FeedbackRepository feedbackRepository;

	public DashboardStatisticsDTO getStatistics() {

		List<Request> requests = requestRepository.findAll();

		int totalRequests = requests.size();

		int receivedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RECEIVED).count();

		int inProgressRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.IN_PROGRESS)
				.count();

		int resolvedRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.RESOLVED).count();

		int cancelledRequests = (int) requests.stream().filter(r -> r.getStatus() == RequestStatus.CANCELLED).count();

		double resolutionRate = totalRequests == 0 ? 0.0 : (resolvedRequests * 100.0) / totalRequests;

		int totalUsers = (int) userRepository.count();

		int totalVotes = (int) voteRepository.count();

		int totalFeedbacks = (int) feedbackRepository.count();

		List<Feedback> feedbacks = feedbackRepository.findAll();

		double averageRating = feedbacks.stream().mapToInt(Feedback::getRating).average().orElse(0.0);

		return new DashboardStatisticsDTO(totalRequests, receivedRequests, inProgressRequests, resolvedRequests,
				cancelledRequests, resolutionRate, totalUsers, totalVotes, totalFeedbacks, averageRating);
	}

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