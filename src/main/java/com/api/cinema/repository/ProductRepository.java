package com.api.cinema.repository;

import com.api.cinema.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
