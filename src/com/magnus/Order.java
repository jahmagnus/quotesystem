package com.magnus;

public class Order {
    private String customerID;
    private Quote quote;

    public Order(String customerID, Quote quote) {
        this.customerID = customerID;
        this.quote = quote;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
