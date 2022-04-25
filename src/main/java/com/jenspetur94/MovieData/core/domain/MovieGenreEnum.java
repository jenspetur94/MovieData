package com.jenspetur94.MovieData.core.domain;

import java.util.Arrays;
import java.util.Optional;

public enum MovieGenreEnum {
    ACTION("Action"),
    ADVENTURE("Adventure"),
    ANIMATION("Animation"),
    CHILDREN("Children"),
    COMEDY("Comedy"),
    CRIME("Crime"),
    DOCUMENTARY("Documentary"),
    DRAMA("Drama"),
    FANTASY("Fantasy"),
    FILM_NOIR("Film-Noir"),
    HORROR("Horror"),
    MUSICAL("Musical"),
    MYSTERY("Mystery"),
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    THRILLER("Thriller"),
    WAR("War"),
    WESTERN("Western");

    private String displayName;
    MovieGenreEnum(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Optional<MovieGenreEnum> get(String genre){
        return Arrays.stream(MovieGenreEnum.values())
                .filter(movie -> movie.displayName.equals((genre)))
                .findFirst();
    }
}
