package com.models;

import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

public class Ticket {

    @NotBlank(message = "Enter Journey Starts From Please")
    private String journeyStart;
    @NotBlank(message = "Enter Destination Place Please")
    private String destination;
    @NotNull(message = "Enter Date of Journey Please")
    private Date journeyDate;
    @NotNull(message = "Enter Number of Seat Please")
    private int numberOfSeat;
    private String coachSeatNumber;
    private double price;

    public Ticket(String journeyStart, String destination, Date journeyDate, int numberOfSeat, String coachSeatNumber, double price) {
        this.journeyStart = journeyStart;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.numberOfSeat = numberOfSeat;
        this.coachSeatNumber = coachSeatNumber;
        this.price = price;
    }

    public Ticket() {
    }

    public String getJourneyStart() {
        return journeyStart;
    }

    public void setJourneyStart(String journeyStart) {
        this.journeyStart = journeyStart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getCoachSeatNumber() {
        return coachSeatNumber;
    }

    public void setCoachSeatNumber(String coachSeatNumber) {
        this.coachSeatNumber = coachSeatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void generationCoachSeatNumber() {
        this.coachSeatNumber = "SEAT_" + Math.random() * 100;
    }

    public void calculatedPrice() {
        this.price = 200 * numberOfSeat;
    }
}
