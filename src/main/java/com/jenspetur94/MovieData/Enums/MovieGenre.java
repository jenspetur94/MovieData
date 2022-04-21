package com.jenspetur94.MovieData.Enums;

import java.util.Arrays;
import java.util.Optional;

public enum MovieGenre {
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
    MovieGenre(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Optional<MovieGenre> get(String genre){
        return Arrays.stream(MovieGenre.values())
                .filter(movie -> movie.displayName.equals((genre)))
                .findFirst();
    }
}
