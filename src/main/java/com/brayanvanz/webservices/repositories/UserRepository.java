package com.brayanvanz.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanvanz.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

} 
