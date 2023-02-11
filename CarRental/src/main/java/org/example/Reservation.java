package org.example;

import org.example.Products.Vehicle;

import java.util.Date;

public class Reservation {

    private Long id;
    private User user;
    private Vehicle vehicle;
    Date bookingDate;
    Date startDate;
    Date endDate;
    Long fromTime;
    Long toTime;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

}
