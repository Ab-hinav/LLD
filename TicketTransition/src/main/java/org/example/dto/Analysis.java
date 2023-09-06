package org.example.dto;

import org.example.Interfaces.State;

public class Analysis implements State {
    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        System.out.println("Ticket already in analysis");
        return false;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {

        return true;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        return false;
    }
}
