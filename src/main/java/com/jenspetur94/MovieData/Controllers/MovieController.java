package com.jenspetur94.MovieData.Controllers;

import com.jenspetur94.MovieData.Domain.Movie;
import com.jenspetur94.MovieData.Repositories.MovieRepository;
import com.jenspetur94.MovieData.RequestModels.AddMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
@RequestMapping(path="movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(path="")
    public @ResponseBody String addNewMovie(@RequestBody AddMovieRequest addMovieRequest){
        Movie movie = new Movie();
        movie.setGenres(addMovieRequest.getGenres());
        movie.setTitle(addMovieRequest.getTitle());
        movieRepository.save((movie));
        return "Saved";
    }


    @GetMapping("/all")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

//    @GetMapping("/{id}")
//    public @ResponseBody Movie getMovieById(@PathVariable id){
//        if(movieRepository.existsById(id))
//            return movieRepository.findById(id);
//        return new HttpClientErrorException.BadRequest();
//    }
}
