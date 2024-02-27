package com.example.Movies_Lab.respositories;

import com.example.Movies_Lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
