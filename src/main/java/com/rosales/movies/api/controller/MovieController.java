package com.rosales.movies.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosales.movies.api.model.Movie;
import com.rosales.movies.repo.MovieRepo;

@RequestMapping("/movies")
@RestController
public class MovieController {

  @Autowired
  private MovieRepo movieRepo;

  @GetMapping("/")
  public String home() {
    return "Welcome to MovieHub!";
  }

  @GetMapping("/get")
  public List<Movie> getMovies() {
    return movieRepo.findAll();
  }

  @PostMapping("/create")
  public String saveMovie(@RequestBody @NonNull Movie movie) {
    movieRepo.save(movie);
    return "Movie saved!";
  }

  @GetMapping("/get/{id}")
  public Movie getMovie(@PathVariable("id") long id) {
    return movieRepo.findById(id).get();
  }

  @PutMapping("/update/{id}")
  public String updateMovie(@PathVariable("id") long id, @RequestBody @NonNull Movie movie) {
    Movie existingMovie = movieRepo.findById(id).get();
    existingMovie.setTitle(movie.getTitle());
    existingMovie.setDirector(movie.getDirector());
    existingMovie.setYear(movie.getYear());
    existingMovie.setCountry(movie.getCountry());
    existingMovie.setGenre(movie.getGenre());
    movieRepo.save(existingMovie);
    return "Movie updated!";
  }

  @SuppressWarnings ("null")
  @DeleteMapping(value = "/delete/{id}")
  public String deleteMovie(@PathVariable("id") long id) {
    Movie movie = movieRepo.findById(id).get();
    movieRepo.delete(movie);
    return "Movie deleted!";
  }

}
