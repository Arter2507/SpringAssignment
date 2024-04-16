package com.controllers;

import com.models.Ticket;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "ticketContronllerManagedBean")
@SessionScoped
public class ticketContronllerManagedBean implements Serializable {

    private Ticket ticket = new Ticket();

    public ticketContronllerManagedBean() {
    }

    public String bookingTicket() {
        System.out.println("---------->" + ticket.getJourneyDate());
        ticket.generationCoachSeatNumber();
        ticket.calculatedPrice();
        return "confirmation.xhtml?faces-redirect=true";
    }

    public Ticket getTicket() {
        return ticket;
    }
}
