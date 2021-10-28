package com.example.orderservice.service;

import com.example.orderservice.entiy.Order;
import com.example.orderservice.repositories.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Order saveOrder(Order order) {
        log.info("Inside saveOrder of Service!");
        return orderRepository.save(order);
    }
    public Order findOrderId(Long orderId) {
        log.info("Inside saveOrder of Service!");
        return orderRepository.findById(orderId).get();
    }
}
