package com.api.cinema.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Drink extends Product {

    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String flavor;
}
