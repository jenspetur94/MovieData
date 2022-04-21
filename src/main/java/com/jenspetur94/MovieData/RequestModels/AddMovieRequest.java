package com.jenspetur94.MovieData.RequestModels;

import java.util.List;

public class AddMovieRequest {
    private String title;
    private List<String> genres;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}
