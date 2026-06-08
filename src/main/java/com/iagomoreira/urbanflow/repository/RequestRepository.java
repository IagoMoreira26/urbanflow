package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Request;
import com.iagomoreira.urbanflow.model.enums.RequestStatus;

@Repository
public interface RequestRepository extends MongoRepository<Request, String> {

	List<Request> findByStatus(RequestStatus status);

	List<Request> findByCategoryId(String categoryId);

	List<Request> findBySubCategoryId(String subCategoryId);

	List<Request> findByUserId(String userId);
}
