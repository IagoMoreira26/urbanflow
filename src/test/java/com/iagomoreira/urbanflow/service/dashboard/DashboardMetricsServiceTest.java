package com.iagomoreira.urbanflow.service.dashboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iagomoreira.urbanflow.model.Feedback;
import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;
import com.iagomoreira.urbanflow.repository.FeedbackRepository;
import com.iagomoreira.urbanflow.repository.RequestRepository;
import com.iagomoreira.urbanflow.repository.UserRepository;
import com.iagomoreira.urbanflow.repository.VoteRepository;

@ExtendWith(MockitoExtension.class)
class DashboardMetricsServiceTest {

	@Mock
	private RequestRepository requestRepository;

	@Mock
	private UserRepository userRepository;

	@Mock
	private VoteRepository voteRepository;

	@Mock
	private FeedbackRepository feedbackRepository;

	@InjectMocks
	private DashboardMetricsService metricsService;

	private Request request1;
	private Request request2;
	private Feedback feedback1;
	private Feedback feedback2;
	private Feedback feedback3;

	@BeforeEach
	void setUp() {
		request1 = new Request();
		request1.setStatus(RequestStatus.RESOLVED);

		request2 = new Request();
		request2.setStatus(RequestStatus.IN_PROGRESS);

		feedback1 = new Feedback();
		feedback1.setRating(5);

		feedback2 = new Feedback();
		feedback2.setRating(4);

		feedback3 = new Feedback();
		feedback3.setRating(3);
	}

	@Test
	void getRequests_shouldReturnAllRequests() {
		List<Request> expected = Arrays.asList(request1, request2);
		when(requestRepository.findAll()).thenReturn(expected);

		List<Request> result = metricsService.getRequests();

		assertEquals(expected, result);
		verify(requestRepository).findAll();
	}

	@Test
	void countRequests_shouldReturnTotalRequests() {
		when(requestRepository.count()).thenReturn(10L);

		long result = metricsService.countRequests();

		assertEquals(10L, result);
		verify(requestRepository).count();
	}

	@Test
	void countByStatus_shouldReturnCountByStatus() {
		List<Request> resolvedRequests = Collections.singletonList(request1);
		when(requestRepository.findByStatus(RequestStatus.RESOLVED)).thenReturn(resolvedRequests);

		long result = metricsService.countByStatus(RequestStatus.RESOLVED);

		assertEquals(1L, result);
		verify(requestRepository).findByStatus(RequestStatus.RESOLVED);
	}

	@Test
	void countUsers_shouldReturnTotalUsers() {
		when(userRepository.count()).thenReturn(25L);

		long result = metricsService.countUsers();

		assertEquals(25L, result);
		verify(userRepository).count();
	}

	@Test
	void countVotes_shouldReturnTotalVotes() {
		when(voteRepository.count()).thenReturn(15L);

		long result = metricsService.countVotes();

		assertEquals(15L, result);
		verify(voteRepository).count();
	}

	@Test
	void countFeedbacks_shouldReturnTotalFeedbacks() {
		when(feedbackRepository.count()).thenReturn(8L);

		long result = metricsService.countFeedbacks();

		assertEquals(8L, result);
		verify(feedbackRepository).count();
	}

	@Test
	void getFeedbacks_shouldReturnAllFeedbacks() {
		List<Feedback> expected = Arrays.asList(feedback1, feedback2, feedback3);
		when(feedbackRepository.findAll()).thenReturn(expected);

		List<Feedback> result = metricsService.getFeedbacks();

		assertEquals(expected, result);
		verify(feedbackRepository).findAll();
	}

	@Test
	void getAverageRating_shouldReturnAverage() {
		List<Feedback> feedbacks = Arrays.asList(feedback1, feedback2, feedback3);
		when(feedbackRepository.findAll()).thenReturn(feedbacks);

		double result = metricsService.getAverageRating();

		assertEquals(4.0, result, 0.01);
		verify(feedbackRepository).findAll();
	}

	@Test
	void getAverageRating_shouldReturnZeroWhenNoFeedbacks() {
		when(feedbackRepository.findAll()).thenReturn(List.of());

		double result = metricsService.getAverageRating();

		assertEquals(0.0, result, 0.01);
		verify(feedbackRepository).findAll();
	}

	@Test
	void getResolutionRate_shouldCalculateCorrectly() {
		when(requestRepository.count()).thenReturn(10L);
		when(requestRepository.findByStatus(RequestStatus.RESOLVED))
				.thenReturn(Arrays.asList(new Request(), new Request(), new Request()));

		double result = metricsService.getResolutionRate();

		assertEquals(30.0, result, 0.01);
		verify(requestRepository).count();
		verify(requestRepository).findByStatus(RequestStatus.RESOLVED);
	}

	@Test
	void getResolutionRate_shouldReturnZeroWhenNoRequests() {
		when(requestRepository.count()).thenReturn(0L);

		double result = metricsService.getResolutionRate();

		assertEquals(0.0, result, 0.01);
		verify(requestRepository).count();
		verify(requestRepository, org.mockito.Mockito.never()).findByStatus(RequestStatus.RESOLVED);
	}
}