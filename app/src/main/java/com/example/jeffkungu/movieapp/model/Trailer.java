package com.example.jeffkungu.movieapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jeffkungu on 25/01/2018.
 *
 * Trailer is a model representing the data within the results value within the JSON TrailerResponse object fetched from the MovieDb Api.
 *
 * Example below is a representation of the TrailerResponse JSON object retrieved. We are more interested in the "Key" and "name" values within the results ArrayList value.
 * The "Key" value helps us access the trailer on youtube by parsing it at the end of the Url leading to the video trailer on youtube.
 *
 {
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
 *
 */

public class Trailer {

    @SerializedName("key")
    private String key;
    @SerializedName("name")
    private String name;

    public Trailer(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
