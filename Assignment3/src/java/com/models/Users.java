package com.models;

public class Users {
    private String name;

    public String getName() {
        return name != null && !name.isEmpty() ? name : "User";
    }

    public void setName(String name) {
        this.name = name;
    }
}
