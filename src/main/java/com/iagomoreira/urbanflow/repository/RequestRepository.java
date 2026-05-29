package com.iagomoreira.urbanflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Request;

@Repository
public interface RequestRepository extends MongoRepository<Request, String> {

}
