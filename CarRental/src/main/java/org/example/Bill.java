package org.example;

public class Bill {

    Reservation reservation;
    Double totalAmount;
    boolean isPaid;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalAmount = computeBillAmount();
        this.isPaid = false;
    }

    public Double computeBillAmount(){
        //compute bill amount
        return 0.0;
    }

}
