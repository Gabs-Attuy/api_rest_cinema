package com.api.cinema.service;

import com.api.cinema.dto.DrinkDto;
import com.api.cinema.dto.PopcornDto;
import com.api.cinema.model.Drink;
import com.api.cinema.model.Popcorn;
import com.api.cinema.repository.DrinkRepository;
import com.api.cinema.repository.PopcornRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final PopcornRepository popcornRepository;
    private final DrinkRepository drinkRepository;

    public ResponseEntity<Drink> createDrink(DrinkDto dto) {
        Drink drink = new Drink();
        drink.setSize(dto.getSize());
        drink.setPrice(dto.getPrice());
        drink.setFlavor(dto.getFlavor());
        drink.setType(dto.getType());
        drink.setBrand(dto.getBrand());
        drinkRepository.save(drink);
        return new ResponseEntity<>(drink, HttpStatus.CREATED);
    }

    public ResponseEntity<Popcorn> createPopcorn(PopcornDto dto) {
        Popcorn popcorn = new Popcorn();
        popcorn.setFlavor(dto.getFlavor());
        popcorn.setPrice(dto.getPrice());
        popcorn.setSize(dto.getSize());
        popcornRepository.save(popcorn);
        return new ResponseEntity<>(popcorn, HttpStatus.CREATED);
    }
}
