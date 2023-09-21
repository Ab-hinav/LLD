package org.example;

public class Main {
    public static void main(String[] args) {

//        User user1 = new User();
//        create users and stores
//        add vehicles in store
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();

        Location location = new Location();
        Store store = vehicleRentalSystem.getStore(location);
        List<Vehicle> vehicleList = store.getVehicles();
        Reservation reservation = new Reservation(vehicleList.get(2),user);

        //4. generate the bill
        Bill bill = new Bill(reservation);

        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationId);




    }
}