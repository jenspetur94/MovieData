package com.jenspetur94.MovieData.Controllers;

import com.jenspetur94.MovieData.data.db.jpa.entities.MovieData;
import com.jenspetur94.MovieData.Repositories.MovieRepository;
import com.jenspetur94.MovieData.RequestModels.AddMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @PostMapping(path="")
    public @ResponseBody String addNewMovie(@RequestBody AddMovieRequest addMovieRequest){

        return "Saved";
    }


    @GetMapping("/all")
    public @ResponseBody Iterable<MovieData> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieData> getMovieById(@PathVariable Integer id){
        return ResponseEntity.of(movieRepository.findById(id));
    }
}
