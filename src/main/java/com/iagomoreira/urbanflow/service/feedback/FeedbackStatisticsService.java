package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.mapper.FeedbackMapper;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;

@Service
public class FeedbackStatisticsService {

	private final FeedbackRepository feedbackRepository;
	private final FeedbackValidationService feedbackValidationService;
	private final FeedbackMapper feedbackMapper;

	public FeedbackStatisticsService(FeedbackRepository feedbackRepository,
			FeedbackValidationService feedbackValidationService, FeedbackMapper feedbackMapper) {
		super();
		this.feedbackRepository = feedbackRepository;
		this.feedbackValidationService = feedbackValidationService;
		this.feedbackMapper = feedbackMapper;
	}

	public FeedbackStatisticsDTO getStatistics(String requestId) {

		feedbackValidationService.validateRequestExists(requestId);

		List<Feedback> feedbacks = feedbackRepository.findByRequestId(requestId);
		int totalFeedbacks = feedbacks.size();

		if (totalFeedbacks == 0) {
			return feedbackMapper.toStatisticsResponse(0.0, 0, 0, 0, 0, 0, 0, 0.0);
		}

		int fiveStars = (int) feedbacks.stream().filter(f -> f.getRating() == 5).count();
		int fourStars = (int) feedbacks.stream().filter(f -> f.getRating() == 4).count();
		int threeStars = (int) feedbacks.stream().filter(f -> f.getRating() == 3).count();
		int twoStars = (int) feedbacks.stream().filter(f -> f.getRating() == 2).count();
		int oneStar = (int) feedbacks.stream().filter(f -> f.getRating() == 1).count();

		double averageRating = feedbacks.stream().mapToInt(Feedback::getRating).average().orElse(0.0);
		long satisfiedCount = feedbacks.stream().filter(f -> f.getRating() >= 4).count();
		double satisfactionPercentage = (satisfiedCount * 100.0) / totalFeedbacks;

		return feedbackMapper.toStatisticsResponse(averageRating, totalFeedbacks, fiveStars, fourStars, threeStars,
				twoStars, oneStar, satisfactionPercentage);
	}
}