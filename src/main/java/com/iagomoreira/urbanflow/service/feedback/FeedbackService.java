package com.iagomoreira.urbanflow.service.feedback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackCommandService feedbackCommandService;

	@Autowired
	private FeedbackQueryService feedbackQueryService;

	@Autowired
	private FeedbackStatisticsService feedbackStatisticsService;

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
