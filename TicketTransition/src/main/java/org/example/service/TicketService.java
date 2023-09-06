package org.example.service;

import org.example.Interfaces.State;
import org.example.dto.*;
import org.example.enums.TicketStatus;

public class TicketService {

    public Ticket createTicket(String description, User createdBy){
        Ticket ticket = new Ticket(description,createdBy);
        return ticket;
    }

   public void startAnalysis(Ticket ticket,User user){
        boolean isFeasable = ticket.getTicketStatus().startAnalysis(ticket,user);
        if (isFeasable){
            ticket.setTicketStatus(new Analysis());
        }
   }

    public void startReview(Ticket ticket,User user){
        boolean isFeasable = ticket.getTicketStatus().startReview(ticket,user);
        if (isFeasable){
            ticket.setTicketStatus(new Review());
        }
    }
    public void markDone(Ticket ticket,User user){
        boolean isFeasable = ticket.getTicketStatus().markDone(ticket,user);
        if (isFeasable){
            ticket.setTicketStatus(new MarkDone());
        }
    }

}
