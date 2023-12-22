package com.example.spring.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.spring.product.entity.JpaProduct;

@RepositoryRestResource(path = "products")
public interface JpaProductRepository extends JpaRepository<JpaProduct, Long> {}
