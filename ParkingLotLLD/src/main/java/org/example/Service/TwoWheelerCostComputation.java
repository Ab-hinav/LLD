package org.example.Service;

import org.example.Model.Ticket;

public class TwoWheelerCostComputation extends CostComputation {

    public TwoWheelerCostComputation() {
        super(new HourlyPricing());
    }


}
