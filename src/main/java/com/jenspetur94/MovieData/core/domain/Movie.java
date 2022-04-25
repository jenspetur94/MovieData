package com.jenspetur94.MovieData.core.domain;

import lombok.Value;

import java.util.List;

@Value
public class Movie {
    private final Integer id;
    private final String title;
    private final List<MovieGenreEnum> genres;
    private final List<Tag> tags;
    private final List<Rating> ratings;
}