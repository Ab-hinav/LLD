package org.example.dto;

import org.example.Interfaces.State;

public class Review implements State {
    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        return false;
    }

    @Override
    public boolean startReview(Ticket ticket, User user) {
        return false;
    }

    @Override
    public boolean markDone(Ticket ticket, User user) {
        return true;
    }
}
