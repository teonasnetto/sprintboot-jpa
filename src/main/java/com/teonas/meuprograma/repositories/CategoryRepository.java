package com.teonas.meuprograma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teonas.meuprograma.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
