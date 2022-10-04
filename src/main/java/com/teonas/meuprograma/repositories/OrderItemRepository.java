package com.teonas.meuprograma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.meuprograma.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
