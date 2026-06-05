package com.iagomoreira.urbanflow.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iagomoreira.urbanflow.model.SubCategory;

@Repository
public interface SubCategoryRepository extends MongoRepository<SubCategory, String> {

	List<SubCategory> findByCategoryId(String categoryId);
}
