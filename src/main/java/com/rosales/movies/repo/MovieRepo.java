package com.rosales.movies.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosales.movies.api.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Long> {

}
