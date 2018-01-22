package com.example.jeffkungu.movieapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jeffkungu on 10/11/2017.
 *
 * The Client class is used to connect to the MovieDb Api with the help of retrofit library.
 */

public class   Client {
    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static Retrofit retrofit = null;

    // Method to return a retrofit instance
    // The retrofit instance creates a connection to the api.
    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
