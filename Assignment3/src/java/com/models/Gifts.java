package com.models;

public class Gifts {
    private long giftID;
    private String giftName;
    private double price;
    private String colors;
    private String category;
    
    public Gifts(long giftID, String giftName, double price, String colors, String category) {
        this.giftID = giftID;
        this.giftName = giftName;
        this.price = price;
        this.colors = colors;
        this.category = category;
    }

    public Gifts() {
    }

    public long getGiftID() {
        return giftID;
    }

    public void setGiftID(long giftID) {
        this.giftID = giftID;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
