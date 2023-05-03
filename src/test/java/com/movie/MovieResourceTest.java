package com.movie;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class MovieResourceTest {

    @Test
    public void testMovieEndpoint() {
        given()
          .when().get("/api/movies")
          .then()
             .statusCode(200);
    }

    @Test
    public void testMovieEndpointByGenre() {
        given()
                .when().get("/api/movies/genre/comedy")
                .then()
                .statusCode(200);
    }

    @Test
    public void testMovieEndpointByYear() {
        given()
                .when().get("/api/movies/year/1995")
                .then()
                .statusCode(200);
    }

}