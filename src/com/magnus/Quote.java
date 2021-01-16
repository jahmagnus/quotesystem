package com.magnus;

public class Quote {

    private String deliveryPlace;
    private String pickupPlace;
    private double quotePrice;

    public Quote(String deliveryPlace, String pickupPlace, double quotePrice) {
        this.deliveryPlace = deliveryPlace;
        this.pickupPlace = pickupPlace;
        this.quotePrice = quotePrice;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getPickupPlace() {
        return pickupPlace;
    }

    public void setPickupPlace(String pickupPlace) {
        this.pickupPlace = pickupPlace;
    }

    public double getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(double quotePrice) {
        this.quotePrice = quotePrice;
    }
}
