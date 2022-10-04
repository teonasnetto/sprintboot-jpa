package com.teonas.meuprograma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.meuprograma.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
