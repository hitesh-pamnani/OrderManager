package com.example.spring.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.spring.orders.entity.JpaOrderItem;

@RepositoryRestResource(path = "order-items")
public interface JpaOrderItemRepository extends JpaRepository<JpaOrderItem, Long> {}
