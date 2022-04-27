package com.jenspetur94.MovieData.core.usecases.movie;

import com.jenspetur94.MovieData.core.domain.Movie;
import com.jenspetur94.MovieData.core.domain.MovieGenreEnum;
import com.jenspetur94.MovieData.core.usecases.UseCase;
import lombok.Value;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class CreateMovieUseCase extends UseCase<CreateMovieUseCase.InputValues, CreateMovieUseCase.OutputValues>{
    private MovieRepository movieRepository;

    @Override
    public OutputValues execute(InputValues input){
        List<MovieGenreEnum> convertedGenres = input.getGenres().stream()
                .map(MovieGenreEnum::get)
                .filter(converted -> converted.isPresent())
                .map(Optional::get)
                .collect(toList());
        Movie movie = Movie.newInstance(input.getTitle(), convertedGenres);
        return new OutputValues(movieRepository.persist(movie));
    }
    @Value
    public static class InputValues implements UseCase.InputValues{
        private final String title;
        private final List<String> genres;
    }

    @Value
    public static class OutputValues implements UseCase.OutputValues{
        private final Movie movie;
    }
}
