package com.hyunul.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyunul.user.model.User;
import com.hyunul.user.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // public String login(User user) {
    // return
    // }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
