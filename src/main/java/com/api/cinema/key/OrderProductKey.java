package com.api.cinema.key;

import com.api.cinema.model.Order;
import com.api.cinema.model.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Embeddable
public class OrderProductKey {

    @ManyToOne
    @JoinColumn(name = "fk_order_id")
    private Order orderId;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product productId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProductKey that = (OrderProductKey) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
}
