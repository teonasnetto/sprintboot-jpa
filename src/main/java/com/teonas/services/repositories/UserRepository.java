package com.teonas.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.services.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
