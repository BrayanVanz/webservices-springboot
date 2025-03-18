package com.brayanvanz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanvanz.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
