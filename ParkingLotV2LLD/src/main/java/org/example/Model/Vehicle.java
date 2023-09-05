package org.example.Model;

public class Vehicle extends BaseEntity{

    String name;
    String regNumber;
    String color;
    Ticket ticket;

    public Vehicle(String name,String regNumber,String color){
        this.color = color;
        this.name = name;
        this.regNumber = regNumber;
    }

    public void addTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public Ticket getTicket(){
        return ticket;
    }

}
