package com.jenspetur94.MovieData.Repositories;

import com.jenspetur94.MovieData.Domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
