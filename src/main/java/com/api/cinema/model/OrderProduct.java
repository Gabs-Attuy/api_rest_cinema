package com.api.cinema.model;

import com.api.cinema.key.OrderProductKey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "order_product")
@Component
public class OrderProduct {

    @EmbeddedId
    private OrderProductKey id;
    private int quantity;
}
