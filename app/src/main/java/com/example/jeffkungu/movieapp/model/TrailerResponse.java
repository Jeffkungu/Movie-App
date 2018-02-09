package com.example.jeffkungu.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jeffkungu on 25/01/2018.
 *
 * TrailerResponse is a model representing the data fetched from calling the trailer endpoint of the MovieDb Api
 *
 * Example below is a representation of the Jason data retrieved:
 *
 * {
     "id": 550,
     "results": [
         {
             "id": "58f730779251415dfe009fc7",
             "iso_639_1": "en",
             "iso_3166_1": "US",
             "key": "BdJKm16Co6M",
             "name": "Official #TBT Trailer",
             "site": "YouTube",
             "size": 360,
             "type": "Trailer"
         }
     ]
   }
 */

public class TrailerResponse {

    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public int getIdTrailer() {
        return id_trailer;
    }

    public void setIdTrailer(int id_trailer) {
        this.id_trailer = id_trailer;
    }

    public List<Trailer> getResults() {
        return results;
    }

    public void setResults(List<Trailer> results) {
        this.results = results;
    }
}
