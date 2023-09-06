package org.example.Interfaces;

import org.example.dto.Ticket;
import org.example.dto.User;

public interface State {

    public boolean startAnalysis(Ticket ticket, User user);

    public boolean startReview(Ticket ticket,User user);

    public boolean markDone(Ticket ticket,User user);

}
