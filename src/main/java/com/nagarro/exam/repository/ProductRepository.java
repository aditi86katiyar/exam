package com.nagarro.exam.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nagarro.exam.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{ 'attributes.?0' : ?1 }")
    List<Product> findByAttribute(String key, Object value);

	Optional<Product> findById(Long id);
}