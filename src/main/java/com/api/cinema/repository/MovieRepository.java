package com.api.cinema.repository;

import com.api.cinema.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
