package com.api.cinema.repository;

import com.api.cinema.key.OrderSeatKey;
import com.api.cinema.model.OrderSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderSeatRepository extends JpaRepository<OrderSeat, OrderSeatKey> {
}
