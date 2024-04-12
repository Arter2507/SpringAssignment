package com.models;

public class Orders {

    private String giftOrderID;
    private String giftOrderName;
    private int giftOrderQuantity;
    private double giftOrderDiscount;
    private double giftOrderPrice;
    private double discountedPrice;
    private double totalPrice;
    private String giftOrderColors;
    private String giftOrderCategory;

    public Orders() {
    }

    public Orders(String giftOrderID, String giftOrderName, int giftOrderQuantity, double giftOrderDiscount, double giftOrderPrice, double discountedPrice, double totalPrice, String giftOrderColors, String giftOrderCategory) {
        this.giftOrderID = giftOrderID;
        this.giftOrderName = giftOrderName;
        this.giftOrderQuantity = giftOrderQuantity;
        this.giftOrderDiscount = giftOrderDiscount;
        this.giftOrderPrice = giftOrderPrice;
        this.discountedPrice = discountedPrice;
        this.totalPrice = totalPrice;
        this.giftOrderColors = giftOrderColors;
        this.giftOrderCategory = giftOrderCategory;
    }

    public String getGiftOrderID() {
        return giftOrderID;
    }

    public void setGiftOrderID(String giftOrderID) {
        this.giftOrderID = giftOrderID;
    }

    public String getGiftOrderName() {
        return giftOrderName;
    }

    public void setGiftOrderName(String giftOrderName) {
        this.giftOrderName = giftOrderName;
    }

    public int getGiftOrderQuantity() {
        return giftOrderQuantity;
    }

    public void setGiftOrderQuantity(int giftOrderQuantity) {
        this.giftOrderQuantity = giftOrderQuantity;
    }

    public double getGiftOrderDiscount() {
        return giftOrderDiscount;
    }

    public void setGiftOrderDiscount(double giftOrderDiscount) {
        this.giftOrderDiscount = giftOrderDiscount;
    }

    public double getGiftOrderPrice() {
        return giftOrderPrice;
    }

    public void setGiftOrderPrice(double giftOrderPrice) {
        this.giftOrderPrice = giftOrderPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getGiftOrderColors() {
        return giftOrderColors;
    }

    public void setGiftOrderColors(String giftOrderColors) {
        this.giftOrderColors = giftOrderColors;
    }

    public String getGiftOrderCategory() {
        return giftOrderCategory;
    }

    public void setGiftOrderCategory(String giftOrderCategory) {
        this.giftOrderCategory = giftOrderCategory;
    }

    

}
