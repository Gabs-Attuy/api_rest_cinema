package com.api.cinema.repository;

import com.api.cinema.model.Popcorn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PopcornRepository extends JpaRepository<Popcorn, Long> {
}
