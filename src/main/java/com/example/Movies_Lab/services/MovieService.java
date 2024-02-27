package com.example.Movies_Lab.services;


import com.example.Movies_Lab.models.Movie;
import com.example.Movies_Lab.models.Reply;
import com.example.Movies_Lab.respositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Reply addMovie(Movie movie){
        movieRepository.save(movie);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie);
        String message = "Movie added.";
        return new Reply(message, movies);
    }

    public Reply getAllMovies(){
        ArrayList<Movie> movies = new ArrayList<>(movieRepository.findAll());
        String message = "List of movies";
        return new Reply(message, movies);
    }

    public Reply getMovieByID(long id){
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if(movieOptional.isEmpty()){
            return new Reply("Movie not found.", null);
        }
        String message = "Movie Found.";
        Movie movie = movieOptional.get();
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie);
        return new Reply(message, movies);

    }

}
