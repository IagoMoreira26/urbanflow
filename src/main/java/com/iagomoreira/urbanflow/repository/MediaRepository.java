package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Media;

@Repository
public interface MediaRepository extends MongoRepository<Media, String> {

	List<Media> findByRequestId(String requestId);
}
