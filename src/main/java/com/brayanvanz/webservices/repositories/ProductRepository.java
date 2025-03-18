package com.brayanvanz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanvanz.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
