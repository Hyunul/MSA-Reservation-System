package com.hyunul.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyunul.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
