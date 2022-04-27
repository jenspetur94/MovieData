package com.jenspetur94.MovieData.core.usecases.movie;

import com.jenspetur94.MovieData.core.domain.Movie;

import java.util.Optional;

public interface MovieRepository {
    Movie persist(Movie Movie);
    Optional<Movie> getById(Integer id);
}
