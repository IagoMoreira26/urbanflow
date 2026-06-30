package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;

@Service
public class FeedbackService {

	private final FeedbackCommandService feedbackCommandService;
	private final FeedbackQueryService feedbackQueryService;
	private final FeedbackStatisticsService feedbackStatisticsService;

	public FeedbackService(FeedbackCommandService feedbackCommandService, FeedbackQueryService feedbackQueryService,
			FeedbackStatisticsService feedbackStatisticsService) {
		super();
		this.feedbackCommandService = feedbackCommandService;
		this.feedbackQueryService = feedbackQueryService;
		this.feedbackStatisticsService = feedbackStatisticsService;
	}

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {
		return feedbackCommandService.create(dto);
	}

	public List<FeedbackResponseDTO> findAll() {
		return feedbackQueryService.findAll();
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {
		return feedbackQueryService.findByRequest(requestId);
	}

	public FeedbackStatisticsDTO getStatistics(String requestId) {
		return feedbackStatisticsService.getStatistics(requestId);
	}
}
