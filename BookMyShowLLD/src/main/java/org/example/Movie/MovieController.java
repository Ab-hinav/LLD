package org.example.Movie;

import org.example.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    Map<City,List<Movie>> movieByCity;
    List<Movie> movieList;

    public MovieController(){
        movieByCity = new HashMap<>();
        movieList = new ArrayList<>();
    }

    public void addMovie(Movie movie,City city){
        movieList.add(movie);
        if (movieByCity.containsKey(city)) {
            movieByCity.get(city).add(movie);
        }
        else {
            List<Movie> movieList = new ArrayList<>();
            movieList.add(movie);
            movieByCity.put(city,movieList);
        }

    }

    public List<Movie> getMovieByCity(City city){
        return movieByCity.get(city);
    }

    Movie getMovieByName(String name){
        for (Movie movie:movieList) {
            if (movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }


}
