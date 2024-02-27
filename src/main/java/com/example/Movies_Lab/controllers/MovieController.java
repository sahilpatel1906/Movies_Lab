package com.example.Movies_Lab.controllers;

import com.example.Movies_Lab.models.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public ResponseEntity<Reply> getMovies() {
        Reply reply = new Reply("Hello");
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }



}
