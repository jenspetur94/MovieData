package com.jenspetur94.MovieData.core.domain;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class Movie {


    private final Identity id;
    private final String title;
    private final List<MovieGenreEnum> genres;
    private final List<Tag> tags = new ArrayList<Tag>();
    private final List<Rating> ratings = new ArrayList<Rating>();

    public Movie(Identity id, String title, List<MovieGenreEnum> genres) {
        this.id = id;
        this.title = title;
        this.genres = genres;
    }

    public static Movie newInstance(String title, List<MovieGenreEnum> genres){
        return new Movie(
                Identity.nothing(),
                title,
                genres
        );
    }
}