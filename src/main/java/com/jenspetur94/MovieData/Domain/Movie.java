package com.jenspetur94.MovieData.Domain;

import com.jenspetur94.MovieData.Enums.MovieGenre;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @ElementCollection(targetClass = MovieGenre.class)
    @CollectionTable
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

    public void setGenres(List<MovieGenre> genres) {
        this.genres = genres;
    }
}