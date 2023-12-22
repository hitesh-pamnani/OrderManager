package com.example.spring.orders.entity;

import com.example.spring.orders.producer.OrderItemProducer;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "order_items")
@Data
@EntityListeners(OrderItemProducer.class)
public class JpaOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long orderId;

    @NotNull
    private Long productId;

    @NotNull
    private Integer quantity;
}
