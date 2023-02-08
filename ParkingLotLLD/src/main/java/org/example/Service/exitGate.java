package org.example.Service;

import org.example.Model.ParkingSpot;
import org.example.Model.Ticket;
import org.example.Model.Vehicle;

public class exitGate {

    private CostComputation costComputation;
    private PaymentMethod paymentMethod;
    private Ticket ticket;

    public exitGate(Ticket ticket) {
        this.ticket = ticket;
        this.costComputation = CostComputationFactory.getCostComputation(ticket);
    }

    public double costCalculation() {
        costComputation = CostComputationFactory.getCostComputation(ticket);
        return costComputation.computeCost(ticket);
    }

    public boolean updateParkingSpot() {
        Vehicle vehicle = ticket.getParkingSpot().getVehicle();
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        boolean result = parkingSpot.unparkVehicle(vehicle,parkingSpot);
        return result;
    }

    public boolean makePayment(PaymentType paymentType) {
        double cost = costCalculation();
        paymentMethod = PaymentMethodFactory.getPaymentMethod(paymentType);
        return paymentMethod.makePayment(cost);
    }

    public void generateReceipt(Ticket ticket) {
        System.out.println("Please enter ticket");
        double amount = costCalculation();
        System.out.println("Amount to be paid: " + amount);
        System.out.println("Please pay the amount");

        if (makePayment(PaymentType.CASH)) {
            System.out.println("Payment successful");
            updateParkingSpot();
            System.out.println("Thank you for using our service");
        }
        else {
            System.out.println("Payment failed");
        }
    }



}
