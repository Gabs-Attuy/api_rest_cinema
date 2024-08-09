package com.api.cinema.repository;

import com.api.cinema.key.OrderProductKey;
import com.api.cinema.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductKey> {
}
