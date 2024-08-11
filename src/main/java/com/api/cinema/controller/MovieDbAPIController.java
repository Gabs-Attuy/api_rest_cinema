package com.api.cinema.controller;

import com.api.cinema.service.TheMovieDbAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/public")
public class MovieDbAPIController {

    @Autowired
    private TheMovieDbAPI theMovieDbAPI;

    @GetMapping
    public String returnMovies() throws IOException {
        return TheMovieDbAPI.fetchMovieGenres();
    }
}
