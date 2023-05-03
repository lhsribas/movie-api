package com.movie.app.service;

import com.movie.domain.entity.Movie;
import com.movie.domain.usecase.MovieSearchUserCase;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private final MovieSearchUserCase useCase;

    public MovieService() {
        this.useCase = new MovieSearchUserCase();
    }

    public List<Movie> getMovies() {
        return this.useCase.getMovieRoot().getMovies();
    }

    public List<Movie> getMoviesByGenres(final String genre){
        return this.useCase.getMovieRoot().getMovies()
                .stream()
                .filter(movies ->  contains(genre, movies.getGenres()))
                .toList();
    }

    public List<Movie> getMoviesByYear(final String year){
        return this.useCase.getMovieRoot().getMovies()
                .stream()
                .filter(movies -> movies.getYear().equals(year))
                .toList();
    }

    private boolean contains(final String str, final ArrayList<String> strArray) {
        if (str == null || strArray == null) {
            return false;
        }

        return strArray.stream()
                .map(String::toUpperCase)
                .toList().contains(str.toUpperCase());
    }
}
