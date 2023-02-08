package org.example.impl2;

public class Player {

    private int id;
    private int position;

    public Player(int id,int position){
        this.id = id;
        this.position = position;
    }

    public int getId(){
        return this.id;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }



}
