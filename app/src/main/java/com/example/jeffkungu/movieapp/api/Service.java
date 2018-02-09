package com.example.jeffkungu.movieapp.api;

import com.example.jeffkungu.movieapp.model.MoviesResponse;
import com.example.jeffkungu.movieapp.model.TrailerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Jeffkungu on 10/11/2017.
 *
 * The Service is an interface class with methods used to create the Api endpoints
 */

public interface Service {

    // The @GET annotation makes it possible to perform HTTP calls to the GET API-endpoint
    // The base url for movie api is: https://api.themoviedb.org

    // The url for movie api (get popular movies) is: https://api.themoviedb.org/3/movie/popular?api_key="The Api key"
    @GET("movie/popular")
    Call<MoviesResponse>  getPopularMovies(@Query("api_key") String apiKey);

    // The url for movie api (get top_rated movies) is: https://api.themoviedb.org/3/movie/top_rated?api_key="The Api key"
    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    // The url for a single movie-trailer in the movie api is: https://api.themoviedb.org/3/movie/movie_id/videos?api_key="The Api key"
    @GET("movie/{movie_id}/videos")
    Call<TrailerResponse> getMovieTrailer(@Path("movie_id") int id, @Query("api_key") String apiKey);
}
