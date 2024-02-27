package com.example.Movies_Lab.controllers;

import com.example.Movies_Lab.models.Movie;
import com.example.Movies_Lab.models.Reply;
import com.example.Movies_Lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping ResponseEntity<Reply> addMovie(@RequestBody Movie movie) {
        Reply reply = movieService.addMovie(movie);
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Reply> getMovies() {
        Reply reply = movieService.getAllMovies();
        return new ResponseEntity<Reply>(reply, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Reply> getMovies(@PathVariable long id) {
        Reply reply = movieService.getMovieByID(id);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }




}
