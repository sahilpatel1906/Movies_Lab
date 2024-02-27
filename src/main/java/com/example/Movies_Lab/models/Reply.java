package com.example.Movies_Lab.models;

import java.util.ArrayList;

public class Reply {

    private String message;
    private ArrayList<Movie> movies;

    public Reply(){}

    public Reply(String message, ArrayList<Movie> movies){
        this.message = message;
        this.movies = movies;
    }

    public ArrayList<Movie> getMovies() {
        return this.movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
