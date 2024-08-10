package com.api.cinema.model;

import com.api.cinema.dto.PopcornDto;
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
public class Popcorn extends Product {

    @Column(nullable = false)
    private String flavor;

    public Popcorn(PopcornDto dto) {
        this.flavor = dto.getFlavor();
    }
}
