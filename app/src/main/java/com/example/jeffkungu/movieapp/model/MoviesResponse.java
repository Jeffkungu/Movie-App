package com.example.jeffkungu.movieapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Jeffkungu on 10/11/2017.
 *
 * The Movie class is used to manage and present the information of movies as fetched from the MovieDb Api..
 *
 * Example: below is a JSON data illustrating the page, results, total_results and total_pages as main keys of the JSON data from API.
 {
     "page": 1,
     "total_results": 19797,
     "total_pages": 990,
     "results": [
         {
             "vote_count": 5798,
             "id": 346364,
             "video": false,
             "vote_average": 7.1,
             "title": "It",
             "popularity": 746.197542,
             "poster_path": "/9E2y5Q7WlCVNEhP5GiVTjhEhx1o.jpg",
             "original_language": "en",
             "original_title": "It",
             "genre_ids": [
                 18,
                 27,
                 53
             ],
             "backdrop_path": "/tcheoA2nPATCm2vvXw2hVQoaEFD.jpg",
             "adult": false,
             "overview": "In a small town in Maine, seven children known as The Losers Club come face to face with life problems, bullies and a monster that takes the shape of a clown called Pennywise.",
             "release_date": "2017-09-05"
         }
 }
 */

public class MoviesResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Movie> results;
    @SerializedName("total_results")
    private int total_results;
    @SerializedName("total_pages")
    private int total_pages;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public List<Movie> getMovies() {
        return results;
    }

    public void setMovies(List<Movie> results) {
        this.results = results;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }
}
