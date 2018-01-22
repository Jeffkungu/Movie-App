package com.example.jeffkungu.movieapp.api;

import com.example.jeffkungu.movieapp.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Jeffkungu on 10/11/2017.
 *
 * The Service is an interface class with methods used to create the Api endpoints
 */

public interface Service {

    // The @GET annotation makes it possible to perform HTTP calls to the GET API-endpoint
    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
