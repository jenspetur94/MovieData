package com.jenspetur94.MovieData.core.domain;

import lombok.Value;

@Value
public class Rating {
    private final Long id;
    private final User user;
    private final Movie movie;
    private final Integer rating;
}
