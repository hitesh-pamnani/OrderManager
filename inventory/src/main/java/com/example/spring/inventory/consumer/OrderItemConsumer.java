package com.example.spring.inventory.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.spring.inventory.entity.JpaInventory;
import com.example.spring.inventory.service.JpaInventoryService;

@Component
public class OrderItemConsumer {

    @Autowired
    private JpaInventoryService jpaInventoryService;

    private static final Logger LOG = LoggerFactory.getLogger(OrderItemConsumer.class);

    @KafkaListener(topics = "order-items", groupId = "order-item-consumer")
    public void consumer(ConsumerRecord<Long, Integer> record){
        JpaInventory jpaInventory = jpaInventoryService.deductInventory(record.key(), record.value());
        LOG.info("Reduced Inventory. Product ID: {} Available Quantity: {}", jpaInventory.getProductId(), jpaInventory.getAvailableQty());
    }
}
