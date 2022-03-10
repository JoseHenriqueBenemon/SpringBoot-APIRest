package com.example.primeiroprojetospringboot.repositories;

import com.example.primeiroprojetospringboot.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
