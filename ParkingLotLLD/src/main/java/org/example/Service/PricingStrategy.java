package org.example.Service;

import org.example.Model.Ticket;

public interface PricingStrategy {
    public double computeCost(Ticket ticket);

}
