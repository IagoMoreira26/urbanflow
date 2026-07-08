package com.iagomoreira.urbanflow.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.model.Feedback;

class FeedbackMapperTest {

	private FeedbackMapper feedbackMapper;

	@BeforeEach
	void setUp() {
		feedbackMapper = new FeedbackMapper();
	}

	@Test
	void toEntity_shouldMapCreateDtoToEntity() {
		CreateFeedbackDTO dto = new CreateFeedbackDTO();
		dto.setRating(5);
		dto.setComment("Ótimo serviço");
		dto.setRequestId("req-123");

		Feedback entity = feedbackMapper.toEntity(dto);

		assertNotNull(entity);
		assertEquals(dto.getRating(), entity.getRating());
		assertEquals(dto.getComment(), entity.getComment());
		assertEquals(dto.getRequestId(), entity.getRequestId());
	}

	@Test
	void toResponse_shouldMapEntityToResponseDto() {
		Feedback feedback = new Feedback();
		feedback.setId("fb-1");
		feedback.setRating(5);
		feedback.setComment("Ótimo serviço");
		feedback.setCreatedAt(LocalDateTime.now());
		feedback.setUserId("user-123");
		feedback.setRequestId("req-123");

		FeedbackResponseDTO dto = feedbackMapper.toResponse(feedback);

		assertNotNull(dto);
		assertEquals(feedback.getId(), dto.getId());
		assertEquals(feedback.getRating(), dto.getRating());
		assertEquals(feedback.getComment(), dto.getComment());
		assertEquals(feedback.getCreatedAt(), dto.getCreatedAt());
		assertEquals(feedback.getUserId(), dto.getUserId());
		assertEquals(feedback.getRequestId(), dto.getRequestId());
	}

	@Test
	void toResponse_shouldReturnNullWhenFeedbackIsNull() {
		FeedbackResponseDTO dto = feedbackMapper.toResponse(null);
		assertNull(dto);
	}

	@Test
	void toStatisticsResponse_shouldMapAllFields() {
		Double averageRating = 4.5;
		Integer totalFeedbacks = 10;
		Integer fiveStars = 5;
		Integer fourStars = 3;
		Integer threeStars = 1;
		Integer twoStars = 1;
		Integer oneStar = 0;
		Double satisfactionPercentage = 80.0;

		FeedbackStatisticsDTO dto = feedbackMapper.toStatisticsResponse(averageRating, totalFeedbacks, fiveStars,
				fourStars, threeStars, twoStars, oneStar, satisfactionPercentage);

		assertNotNull(dto);
		assertEquals(averageRating, dto.getAverageRating());
		assertEquals(totalFeedbacks, dto.getTotalFeedbacks());
		assertEquals(fiveStars, dto.getFiveStars());
		assertEquals(fourStars, dto.getFourStars());
		assertEquals(threeStars, dto.getThreeStars());
		assertEquals(twoStars, dto.getTwoStars());
		assertEquals(oneStar, dto.getOneStar());
		assertEquals(satisfactionPercentage, dto.getSatisfactionPercentage());
	}
}