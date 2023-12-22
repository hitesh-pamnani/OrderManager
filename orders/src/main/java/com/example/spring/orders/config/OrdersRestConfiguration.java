package com.example.spring.orders.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.example.spring.orders.entity.JpaOrder;
import com.example.spring.orders.entity.JpaOrderItem;

@Configuration
public class OrdersRestConfiguration implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(JpaOrder.class);
        config.exposeIdsFor(JpaOrderItem.class);
    }
}
