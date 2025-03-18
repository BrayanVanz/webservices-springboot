package com.brayanvanz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanvanz.webservices.entities.OrderItem;
import com.brayanvanz.webservices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
