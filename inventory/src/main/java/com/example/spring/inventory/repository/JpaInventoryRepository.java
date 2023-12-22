package com.example.spring.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.spring.inventory.entity.JpaInventory;

@RepositoryRestResource(path = "inventory")
public interface JpaInventoryRepository extends JpaRepository<JpaInventory, Long> {
    JpaInventory findByProductId(Long productId);
}
