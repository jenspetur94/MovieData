package com.jenspetur94.MovieData.data.db.jpa.entities;

import lombok.Value;

@Value
public class TagData {
    private final Long id;
    private final UserData userData;
    private final MovieData movieData;
    private final String tag;
}
