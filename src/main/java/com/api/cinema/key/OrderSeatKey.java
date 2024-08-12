package com.api.cinema.key;

import com.api.cinema.model.Order;
import com.api.cinema.model.Seat;
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
public class OrderSeatKey {

    @ManyToOne
    @JoinColumn(name = "fk_order_id")
    private Order orderId;

    @ManyToOne
    @JoinColumn(name = "fk_seat_id")
    private Seat seatId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderSeatKey that = (OrderSeatKey) o;
        return Objects.equals(orderId, that.orderId) && Objects.equals(seatId, that.seatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, seatId);
    }
}
