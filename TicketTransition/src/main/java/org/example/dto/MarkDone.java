package org.example.dto;

import org.example.Interfaces.State;

public class MarkDone implements State {
    @Override
    public boolean startAnalysis(Ticket ticket, User user) {
        return true;
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
