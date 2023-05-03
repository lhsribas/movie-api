package com.movie.domain.entity;

import java.util.ArrayList;

public class MovieRoot {
    private ArrayList<String> genres;
    private ArrayList<Movie> movies;

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
}
