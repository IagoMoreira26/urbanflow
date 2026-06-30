package com.iagomoreira.urbanflow.mapper;

import org.springframework.stereotype.Component;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.model.Feedback;

@Component
public class FeedbackMapper {

	public Feedback toEntity(CreateFeedbackDTO dto) {

		Feedback feedback = new Feedback();

		feedback.setRating(dto.getRating());
		feedback.setComment(dto.getComment());
		feedback.setUserId(dto.getUserId());
		feedback.setRequestId(dto.getRequestId());

		return feedback;
	}
}