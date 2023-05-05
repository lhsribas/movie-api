package com.movie.app.resource;

import com.movie.app.service.MovieService;
import jakarta.ws.rs.*;
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
    public Response getByGenres(@PathParam("genre") final String genre) {
        return Response.ok()
                .entity(new MovieService().getMoviesByGenres(genre))
                .build();
    }

    @GET
    @Path("/year/{year}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getByYear(@PathParam("year") final String year) {
        return Response.ok()
                .entity(new MovieService().getMoviesByYear(year))
                .build();
    }

    @GET
    @Path("/400")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get400(){
        return Response.status(400)
                .entity("{\"message\": \"400\"}")
                .build();
    }

    @GET
    @Path("/401")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get401(){
        return Response.status(401)
                .entity("{\"message\": \"401\"}")
                .build();
    }

    @GET
    @Path("/403")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get403(){
        return Response.status(403)
                .entity("{\"message\": \"403\"}")
                .build();
    }

    @GET
    @Path("/404")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get404(){
        return Response.status(404)
                .entity("{\"message\": \"404\"}")
                .build();
    }

    @GET
    @Path("/405")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get405(){
        return Response.status(405)
                .entity("{\"message\": \"405\"}")
                .build();
    }

    @GET
    @Path("/408")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get408(){
        return Response.status(408)
                .entity("{\"message\": \"408\"}")
                .build();
    }

    @GET
    @Path("/409")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get409(){
        return Response.status(409)
                .entity("{\"message\": \"409\"}")
                .build();
    }

    @GET
    @Path("/413")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get413(){
        return Response.status(413)
                .entity("{\"message\": \"413\"}")
                .build();
    }

    @GET
    @Path("/415")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get415(){
        return Response.status(415)
                .entity("{\"message\": \"415\"}")
                .build();
    }

    @GET
    @Path("/422")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get422(){

        StringBuffer sb = new StringBuffer();
        sb.append("{ \"status\": 422,");
        sb.append("\"errorCode\": \"EI_VALIDATION_ERROR_422\",");
        sb.append("\"message\":\"The request Error\",");
        sb.append("\"devMessage\":\"Dev Messsage Error\",");
        sb.append("\"fieldErrors\": [");
        sb.append("{\"field\": \"type\",");
        sb.append("\"code\": \"NotNull\",");
        sb.append("\"rejectedValue\": null,");
        sb.append("\"message\": \"type can not be null\"");
        sb.append("}]}");

        return Response.status(422)
                .entity(sb.toString())
                .build();
    }

    @GET
    @Path("/500")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get500(){
        return Response.status(500)
                .entity("{\"message\": \"500\"}")
                .build();
    }

    @GET
    @Path("/503")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get503(){
        return Response.status(503)
                .entity("{\"message\": \"503\"}")
                .build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response requestSizeLimit(final String body){
        return Response.status(200)
                .entity(body)
                .build();
    }
}
