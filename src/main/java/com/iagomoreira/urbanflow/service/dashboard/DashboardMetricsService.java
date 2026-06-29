package com.iagomoreira.urbanflow.service.dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@Service
public class DashboardMetricsService {

	@Autowired
	private RequestRepository requestRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private VoteRepository voteRepository;

	@Autowired
	private FeedbackRepository feedbackRepository;

	public List<Request> getRequests() {
		return requestRepository.findAll();
	}

	public long countRequests() {
		return requestRepository.count();
	}

	public long countByStatus(RequestStatus status) {
		return requestRepository.findByStatus(status).size();
	}

	public long countUsers() {
		return userRepository.count();
	}

	public long countVotes() {
		return voteRepository.count();
	}

	public long countFeedbacks() {
		return feedbackRepository.count();
	}

	public List<Feedback> getFeedbacks() {
		return feedbackRepository.findAll();
	}

	public double getAverageRating() {

		return feedbackRepository.findAll().stream().mapToInt(Feedback::getRating).average().orElse(0.0);
	}

	public double getResolutionRate() {

		long total = countRequests();

		if (total == 0) {
			return 0.0;
		}

		return (countByStatus(RequestStatus.RESOLVED) * 100.0) / total;
	}
}