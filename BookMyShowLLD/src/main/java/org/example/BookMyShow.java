package org.example;

import org.example.Movie.MovieController;
import org.example.Theater.Theater;
import org.example.Theater.TheaterController;

public class BookMyShow {

    MovieController movieController;
    TheaterController theaterController;

    public BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    public void initialize() {

//        createMovies();
//        createTheaters();

    }

    private void createTheaters() {

        Theater theater1 = new Theater();



    }


}
