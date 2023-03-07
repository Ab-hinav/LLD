package org.example.Theater;

import org.example.City;
import org.example.Screen;
import org.example.Show;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    int id;
    String address;
    City city;

    List<Screen> screenList;
    List<Show> showList;


    public Theater(int id, String address, City city) {
        this.id = id;
        this.address = address;
        this.city = city;
        screenList = new ArrayList<>();
        showList = new ArrayList<>();
    }

    public Theater(){
        screenList = new ArrayList<>();
        showList = new ArrayList<>();
    }

    public void addScreen(Screen screen){
        screenList.add(screen);
    }

    public void addShow(Show show){
        showList.add(show);
    }



}
