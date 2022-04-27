package com.jenspetur94.MovieData.data.db.jpa.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class RatingData {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable= false)
    private UserData userData;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable= false)
    private MovieData movieData;

    @Min(0)
    @Max(5)
    private Integer rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserData getUser() {
        return userData;
    }

    public void setUser(UserData userData) {
        this.userData = userData;
    }

    public MovieData getMovie() {
        return movieData;
    }

    public void setMovie(MovieData movieData) {
        this.movieData = movieData;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
