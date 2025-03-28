package com.brayanvanz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanvanz.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
