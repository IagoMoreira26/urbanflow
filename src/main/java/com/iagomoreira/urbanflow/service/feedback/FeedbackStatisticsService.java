package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackStatisticsService {

	@Autowired
	private FeedbackRepository repository;

	@Autowired
	private FeedbackValidationService validationService;

	public FeedbackStatisticsDTO getStatistics(String requestId) {

		validationService.validateRequestExists(requestId);

		List<Feedback> feedbacks = repository.findByRequestId(requestId);

		int totalFeedbacks = feedbacks.size();

		if (totalFeedbacks == 0) {

			return new FeedbackStatisticsDTO(0.0, 0, 0, 0, 0, 0, 0, 0.0);
		}

		int fiveStars = (int) feedbacks.stream().filter(f -> f.getRating() == 5).count();

		int fourStars = (int) feedbacks.stream().filter(f -> f.getRating() == 4).count();

		int threeStars = (int) feedbacks.stream().filter(f -> f.getRating() == 3).count();

		int twoStars = (int) feedbacks.stream().filter(f -> f.getRating() == 2).count();

		int oneStar = (int) feedbacks.stream().filter(f -> f.getRating() == 1).count();

		double averageRating = feedbacks.stream().mapToInt(Feedback::getRating).average().orElse(0.0);

		long satisfiedCount = feedbacks.stream().filter(f -> f.getRating() >= 4).count();

		double satisfactionPercentage = (satisfiedCount * 100.0) / totalFeedbacks;

		return new FeedbackStatisticsDTO(averageRating, totalFeedbacks, fiveStars, fourStars, threeStars, twoStars,
				oneStar, satisfactionPercentage);
	}
}