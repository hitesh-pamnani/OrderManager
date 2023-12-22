package com.example.spring.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.inventory.entity.JpaInventory;
import com.example.spring.inventory.repository.JpaInventoryRepository;

@Service
public class JpaInventoryService {

    @Autowired
    private JpaInventoryRepository jpaInventoryRepository;

    public JpaInventory deductInventory(Long productId, Integer quantity){
        JpaInventory jpaInventory = jpaInventoryRepository.findByProductId(productId);
        if(jpaInventory == null){
            return null;
        }
        int availableQty = jpaInventory.getAvailableQty() - quantity;
        jpaInventory.setAvailableQty(availableQty);
        return jpaInventoryRepository.save(jpaInventory);
    }
}
