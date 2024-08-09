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
}
