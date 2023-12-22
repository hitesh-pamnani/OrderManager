package com.example.spring.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.spring.orders.entity.JpaOrder;

@RepositoryRestResource(path = "orders")
public interface JpaOrderRepository extends JpaRepository<JpaOrder, Long> {}
