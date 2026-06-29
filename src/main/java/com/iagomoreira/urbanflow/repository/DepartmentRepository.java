package com.iagomoreira.urbanflow.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iagomoreira.urbanflow.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {

	Optional<Department> findByName(String name);

	boolean existsByName(String name);
}