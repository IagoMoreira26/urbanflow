package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Update;

@Repository
public interface UpdateRepository extends MongoRepository<Update, String> {

	List<Update> findByRequestIdOrderByUpdatedAtAsc(String requestId);
}
