package com.magnus;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Customer> customerList;
    private String firstName;
    private String surname;
    private int customerID;

    public Customer(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void addCustomerToList(Customer customer){
        customerList.add(customer);
    }
}
