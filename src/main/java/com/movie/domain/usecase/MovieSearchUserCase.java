package com.movie.domain.usecase;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movie.domain.entity.MovieRoot;

import java.io.InputStream;

public class MovieSearchUserCase {

    public MovieRoot getMovieRoot(){
        return mock();
    }

    private MovieRoot mock(){
        try(InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("movies.json")){
            //pass InputStream to JSON-Library, e.g. using Jackson
            ObjectMapper mapper = new ObjectMapper();

            return mapper.readValue(in, MovieRoot.class);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
 }
