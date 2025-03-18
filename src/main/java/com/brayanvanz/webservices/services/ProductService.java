package com.brayanvanz.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brayanvanz.webservices.entities.Product;
import com.brayanvanz.webservices.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> Product = ProductRepository.findById(id);
        return Product.get();
    }
}
