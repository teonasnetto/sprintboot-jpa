package com.teonas.meuprograma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.meuprograma.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
