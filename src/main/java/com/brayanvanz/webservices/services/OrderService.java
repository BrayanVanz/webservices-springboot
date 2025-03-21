package com.brayanvanz.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brayanvanz.webservices.entities.Order;
import com.brayanvanz.webservices.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
