package org.example.Service;

import org.example.Model.Ticket;

public class CostComputation {

    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double computeCost(Ticket ticket) {
        return pricingStrategy.computeCost(ticket);
    }





}
