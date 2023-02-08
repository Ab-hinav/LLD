package org.example.impl1;

public class Player {

    private int id;
    private int position;

    public Player(int id){
        this.id = id;
        this.position = 0;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }

    public int getId(){
        return this.id;
    }



}
