package com.jenspetur94.MovieData.Domain;

import com.jenspetur94.MovieData.Enums.MovieGenre;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name ="MovieGenre", joinColumns= @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    private List<MovieGenre> genres;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<MovieGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres){
        List<MovieGenre> convertedGenres = genres.stream()
                .map(MovieGenre::get)
                .filter(converted -> !converted.isPresent())
                .map(Optional::get)
                .collect(toList());
        this.genres = convertedGenres;
    }

    public void setGenres(List<MovieGenre> genres) {
        this.genres = genres;
    }
}