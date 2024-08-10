package com.api.cinema.model;

import com.api.cinema.dto.DrinkDto;
import com.api.cinema.dto.PopcornDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private String size;

    public Product(PopcornDto dto) {
        this.price = dto.getPrice();
        this.size = dto.getSize();
    }

    public Product(DrinkDto dto) {
        this.price = dto.getPrice();
        this.size = dto.getSize();
    }
}
