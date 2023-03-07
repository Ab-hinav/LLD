package org.example.Theater;

import org.example.City;
import org.example.Movie.Movie;
import org.example.Show;
import org.example.Theater.Theater;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {

    Map<City, List<Theater>> theatersByCity;
    List<Theater> theaters;

    public TheaterController(){
        theaters = new ArrayList<>();
        theatersByCity = new HashMap<>();
    }

    void addTheater(Theater theater , City city){
        theaters.add(theater);
        List <Theater> theaters = theatersByCity.getOrDefault(city,new ArrayList<>());
        theaters.add(theater);
        theatersByCity.put(city,theaters);
    }

    List<Theater> getTheatersByCity(City city){
        return theatersByCity.get(city);
    }

    Map<Theater,List<Show>> getAllShows(Movie movie, City city) {
        Map<Theater, List<Show>> theaterListMap = new HashMap<>();
        List<Theater> theaters = getTheatersByCity(city);
        for (Theater theater : theaters) {
            List<Show> shows = theater.showList;
            List<Show> showsByMovie = new ArrayList<>();
            for (Show show : shows) {
                if (show.movie.equals(movie)) {
                    showsByMovie.add(show);
                }
            }
            theaterListMap.put(theater, showsByMovie);
        }
        return theaterListMap;
    }




}
