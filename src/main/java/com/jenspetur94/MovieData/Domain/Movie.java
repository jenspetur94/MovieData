package com.jenspetur94.MovieData.Domain;

import com.jenspetur94.MovieData.core.domain.MovieGenreEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @ElementCollection(targetClass = MovieGenreEnum.class)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    private List<MovieGenreEnum> genres;

    @OneToMany(mappedBy = "movie")
    private List<Tag> tags;

    @OneToMany(mappedBy = "movie")
    private List<Rating> ratings;

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

    public List<MovieGenreEnum> getGenres() {
        return genres;
    }

    public void setGenres(List<MovieGenreEnum> genres) {
        this.genres = genres;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}