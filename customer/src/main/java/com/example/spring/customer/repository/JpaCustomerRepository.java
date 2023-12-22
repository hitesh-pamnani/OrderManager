package com.example.spring.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.spring.customer.entity.JpaCustomer;

@RepositoryRestResource(path = "customers")
public interface JpaCustomerRepository extends JpaRepository<JpaCustomer, Long> {}
