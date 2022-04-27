package com.jenspetur94.MovieData.data.db.jpa.entities;

import com.jenspetur94.MovieData.core.domain.MovieGenreEnum;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @ElementCollection(targetClass = MovieGenreEnum.class)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    private List<MovieGenreEnum> genres;

    @OneToMany(mappedBy = "movie")
    private List<TagData> tagData;

    @OneToMany(mappedBy = "movieData")
    private List<RatingData> ratingData;

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

    public List<TagData> getTags() {
        return tagData;
    }

    public void setTags(List<TagData> tagData) {
        this.tagData = tagData;
    }

    public List<RatingData> getRatings() {
        return ratingData;
    }

    public void setRatings(List<RatingData> ratingData) {
        this.ratingData = ratingData;
    }
}