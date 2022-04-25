package com.jenspetur94.MovieData.Domain;

import lombok.Value;

@Value
public class Tag {
    private final Long id;
    private final User user;
    private final Movie movie;
    private final String tag;
}
