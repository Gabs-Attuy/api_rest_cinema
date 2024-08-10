package com.api.cinema.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class DrinkDto {

    @NotBlank
    private String type;
    @NotBlank
    private String brand;
    @NotBlank
    private String flavor;
    @NotBlank
    private String size;
    @NotNull
    @Positive
    private BigDecimal price;
}
