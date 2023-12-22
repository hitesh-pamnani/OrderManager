package com.example.spring.orders.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.spring.orders.entity.JpaOrderItem;

import jakarta.persistence.PostPersist;

@Component
public class OrderItemProducer {

    private final KafkaTemplate<Long, Integer> template;
    private static final Logger LOG = LoggerFactory.getLogger(OrderItemProducer.class);

    @Autowired
    public OrderItemProducer(KafkaTemplate<Long, Integer> template) {
        this.template = template;
    }

    @PostPersist
    public void onPostPersist(JpaOrderItem jpaOrderItem){
        template.send("order-items", jpaOrderItem.getProductId(), jpaOrderItem.getQuantity());
        LOG.info("Added Order Item. ID: {}", jpaOrderItem.getId());
    }
}
