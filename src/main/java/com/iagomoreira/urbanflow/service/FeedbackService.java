package com.iagomoreira.urbanflow.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.dto.feedback.CreateFeedbackDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackResponseDTO;
import com.iagomoreira.urbanflow.dto.feedback.FeedbackStatisticsDTO;
import com.iagomoreira.urbanflow.exception.BusinessException;
import com.iagomoreira.urbanflow.exception.ResourceNotFoundException;
import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RequestRepository requestRepository;

	public FeedbackResponseDTO create(CreateFeedbackDTO dto) {

		validateUser(dto.getUserId());

		Request request = validateRequest(dto.getRequestId());

		validateResolvedRequest(request);

		validateDuplicateFeedback(dto.getUserId(), dto.getRequestId());

		Feedback feedback = fromDTO(dto);

		feedback.setCreatedAt(LocalDateTime.now());

		feedback = feedbackRepository.save(feedback);

		return new FeedbackResponseDTO(feedback);
	}

	public List<FeedbackResponseDTO> findAll() {

		return feedbackRepository.findAll().stream().map(FeedbackResponseDTO::new).collect(Collectors.toList());
	}

	public List<FeedbackResponseDTO> findByRequest(String requestId) {

		validateRequest(requestId);

		return feedbackRepository.findByRequestId(requestId).stream().map(FeedbackResponseDTO::new)
				.collect(Collectors.toList());
	}

	private void validateUser(String userId) {

		if (!userRepository.existsById(userId)) {

			throw new ResourceNotFoundException("User not found");
		}
	}

	private Request validateRequest(String requestId) {

		return requestRepository.findById(requestId)
				.orElseThrow(() -> new ResourceNotFoundException("Request not found"));
	}

	private void validateResolvedRequest(Request request) {

		if (request.getStatus() != RequestStatus.RESOLVED) {

			throw new BusinessException("Feedback can only be submitted for resolved requests");
		}
	}

	private void validateDuplicateFeedback(String userId, String requestId) {

		if (feedbackRepository.existsByUserIdAndRequestId(userId, requestId)) {

			throw new BusinessException("User has already submitted feedback for this request");
		}
	}

	public FeedbackStatisticsDTO getStatistics(String requestId) {

		validateRequest(requestId);

		List<Feedback> feedbacks = feedbackRepository.findByRequestId(requestId);

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

	private Feedback fromDTO(CreateFeedbackDTO dto) {

		Feedback feedback = new Feedback();

		feedback.setRating(dto.getRating());
		feedback.setComment(dto.getComment());

		feedback.setUserId(dto.getUserId());
		feedback.setRequestId(dto.getRequestId());

		return feedback;
	}
}
