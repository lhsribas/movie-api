package com.movie.app.resource;

import com.movie.app.service.MovieService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/movies")
public class MovieResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response kong() {
        return Response.ok()
                .entity(new MovieService().getMovies())
                .build();
    }

    @GET
    @Path("/genre/{genre}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response gwtByGenres(@PathParam("genre") final String genre) {
        return Response.ok()
                .entity(new MovieService().getMoviesByGenres(genre))
                .build();
    }

    @GET
    @Path("/year/{year}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response gwtByYear(@PathParam("year") final String year) {
        return Response.ok()
                .entity(new MovieService().getMoviesByYear(year))
                .build();
    }
}
