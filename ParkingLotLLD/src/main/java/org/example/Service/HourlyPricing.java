package org.example.Service;

import org.example.Model.Ticket;


import java.time.LocalDateTime;

public class HourlyPricing implements PricingStrategy {

    private int hourlyRate = 5;

    @Override
    public double computeCost(Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime CurrTime = LocalDateTime.now();

        int hours = CurrTime.getHour() - entryTime.getHour();

        return hours * hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


}
