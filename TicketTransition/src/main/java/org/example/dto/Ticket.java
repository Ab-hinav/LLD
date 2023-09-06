package org.example.dto;

import org.example.Interfaces.State;
import org.example.enums.TicketStatus;

public class Ticket {

    private String description;
    private User user;
    private State state;

    public Ticket(String description, User user) {
        this.description = description;
        this.user = user;
        this.state = new Analysis();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public State getTicketStatus() {
        return state;
    }

    public void setTicketStatus(State state) {
        this.state = state;
    }
}
