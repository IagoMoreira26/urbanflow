package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Vote;

@Repository
public interface VoteRepository extends MongoRepository<Vote, String> {

	boolean existsByUserIdAndRequestId(String userId, String requestId);

	List<Vote> findByRequestId(String requestId);
}
