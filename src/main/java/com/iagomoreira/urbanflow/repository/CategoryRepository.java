package com.iagomoreira.urbanflow.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
