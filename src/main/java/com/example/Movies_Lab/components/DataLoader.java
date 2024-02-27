package com.example.Movies_Lab.components;

import com.example.Movies_Lab.models.Movie;
import com.example.Movies_Lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieService movieService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Movie movie1 = new Movie("movie1", 10, 150);
        Movie movie2 = new Movie("movie2", 5, 160);
        Movie movie3 = new Movie("movie3", 7, 210);

        movieService.addMovie(movie1);
        movieService.addMovie(movie2);
        movieService.addMovie(movie3);

    }
}
