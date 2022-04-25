package com.jenspetur94.MovieData.Controllers;

import com.jenspetur94.MovieData.Domain.Movie;
import com.jenspetur94.MovieData.core.domain.MovieGenreEnum;
import com.jenspetur94.MovieData.Repositories.MovieRepository;
import com.jenspetur94.MovieData.RequestModels.AddMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping(path="movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(path="")
    public @ResponseBody String addNewMovie(@RequestBody AddMovieRequest addMovieRequest){
        Movie movie = new Movie();
        List<MovieGenreEnum> convertedGenres = addMovieRequest.getGenres().stream()
                .map(MovieGenreEnum::get)
                .filter(converted -> converted.isPresent())
                .map(Optional::get)
                .collect(toList());
        movie.setGenres(convertedGenres);
        movie.setTitle(addMovieRequest.getTitle());
        movieRepository.save((movie));
        return "Saved";
    }


    @GetMapping("/all")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Integer id){
        return ResponseEntity.of(movieRepository.findById(id));
    }
}
