package com.api.cinema.model;

import com.api.cinema.dto.DrinkDto;
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

    private String type;
    private String brand;
    private String flavor;

    public Drink(DrinkDto dto) {
        this.type = dto.getType();
        this.brand = dto.getBrand();
        this.flavor = dto.getFlavor();
    }
}
