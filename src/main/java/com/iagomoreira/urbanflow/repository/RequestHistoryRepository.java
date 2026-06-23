package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iagomoreira.urbanflow.model.RequestHistory;

public interface RequestHistoryRepository extends MongoRepository<RequestHistory, String> {

	List<RequestHistory> findByRequestIdOrderByChangedAtAsc(String requestId);
}