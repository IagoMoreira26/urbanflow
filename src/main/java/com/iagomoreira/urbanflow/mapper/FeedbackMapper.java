package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.model.Feedback;

@Component
public class FeedbackMapper {

	public Feedback toEntity(CreateFeedbackDTO dto) {
		Feedback feedback = new Feedback();
		feedback.setRating(dto.getRating());
		feedback.setComment(dto.getComment());
		feedback.setRequestId(dto.getRequestId());
		return feedback;
	}

	public FeedbackResponseDTO toResponse(Feedback feedback) {
		FeedbackResponseDTO dto = new FeedbackResponseDTO();
		dto.setId(feedback.getId());
		dto.setRating(feedback.getRating());
		dto.setComment(feedback.getComment());
		dto.setCreatedAt(feedback.getCreatedAt());
		dto.setUserId(feedback.getUserId());
		dto.setRequestId(feedback.getRequestId());
		return dto;
	}

	public FeedbackStatisticsDTO toStatisticsResponse(Double averageRating, Integer totalFeedbacks, Integer fiveStars,
			Integer fourStars, Integer threeStars, Integer twoStars, Integer oneStar, Double satisfactionPercentage) {
		FeedbackStatisticsDTO dto = new FeedbackStatisticsDTO();
		dto.setAverageRating(averageRating);
		dto.setTotalFeedbacks(totalFeedbacks);
		dto.setFiveStars(fiveStars);
		dto.setFourStars(fourStars);
		dto.setThreeStars(threeStars);
		dto.setTwoStars(twoStars);
		dto.setOneStar(oneStar);
		dto.setSatisfactionPercentage(satisfactionPercentage);
		return dto;
	}
}