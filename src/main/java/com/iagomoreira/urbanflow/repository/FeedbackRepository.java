package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Feedback;

@Repository
public interface FeedbackRepository extends MongoRepository<Feedback, String> {

	List<Feedback> findByRequestId(String requestId);

	boolean existsByUserIdAndRequestId(String userId, String requestId);
}
