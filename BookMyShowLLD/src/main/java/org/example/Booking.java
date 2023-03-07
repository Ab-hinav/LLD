package org.example;

import java.util.List;

public class Booking {

    Show show;
    Payment payment;
    List<Seat> seats;

    public Booking(Show show, Payment payment, List<Seat> seats) {
        this.show = show;
        this.payment = payment;
        this.seats = seats;
    }

}
