package com.teonas.meuprograma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.meuprograma.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
