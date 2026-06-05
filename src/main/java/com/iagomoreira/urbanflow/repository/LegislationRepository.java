package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Legislation;

@Repository
public interface LegislationRepository extends MongoRepository<Legislation, String> {

	@Query("{ 'keywords' : { $regex : ?0, $options : 'i' } }")
	List<Legislation> searchByKeyword(String keyword);
}
