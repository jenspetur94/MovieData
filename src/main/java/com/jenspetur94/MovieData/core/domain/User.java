package com.jenspetur94.MovieData.core.domain;

import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
public class User {
    private final Integer id;
    private final String name;
    private final Date birthday;
    private final List<Tag> tags;
    private final List<Rating> ratings;
}
