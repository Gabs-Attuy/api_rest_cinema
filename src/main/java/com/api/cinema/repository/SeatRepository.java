package com.api.cinema.repository;

import com.api.cinema.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
