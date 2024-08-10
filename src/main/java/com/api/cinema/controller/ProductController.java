package com.api.cinema.controller;

import com.api.cinema.dto.DrinkDto;
import com.api.cinema.dto.PopcornDto;
import com.api.cinema.model.Drink;
import com.api.cinema.model.Popcorn;
import com.api.cinema.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/drink")
    public ResponseEntity<Drink> createDrink(@RequestBody @Valid DrinkDto dto) {
        return productService.createDrink(dto);
    }

    @PostMapping("/popcorn")
    public ResponseEntity<Popcorn> createPopcorn(@RequestBody @Valid PopcornDto dto) {
        return productService.createPopcorn(dto);
    }
}
