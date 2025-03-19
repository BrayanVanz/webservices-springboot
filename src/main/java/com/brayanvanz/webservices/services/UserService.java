package com.brayanvanz.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.brayanvanz.webservices.entities.User;
import com.brayanvanz.webservices.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long Id) {
        Optional<User> user = userRepository.findById(Id);
        return user.get();
    }

    public User insert(User user) {
        return userRepository.save(user);
    }
}
