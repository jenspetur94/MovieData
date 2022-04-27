package com.jenspetur94.MovieData.Repositories;

import com.jenspetur94.MovieData.data.db.jpa.entities.MovieData;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieData, Integer> {
}
