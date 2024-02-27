package com.example.Movies_Lab.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movies_list")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private int rating;
    @Column
    private int duration;

    public Movie(){}

    public Movie(String title, int rating, int duration){
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
