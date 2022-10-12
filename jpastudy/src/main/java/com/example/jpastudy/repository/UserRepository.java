package com.example.jpastudy.repository;
import com.example.jpastudy.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}