package com.models;

import org.hibernate.validator.constraints.NotBlank;

public class Users {
    @NotBlank(message = "Missing value in: 'Username'")
    private String username;
    @NotBlank(message = "Missing value in: 'Mobile Number'")
    private String mobileNumber;
    @NotBlank(message = "Missing value in: 'Tourist Destination'")
    private String destination;

    public Users(String username, String mobileNumber, String destination) {
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.destination = destination;
    }

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
