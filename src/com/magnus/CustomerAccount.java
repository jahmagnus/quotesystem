package com.magnus;

import java.util.Scanner;

public class CustomerAccount {
    private static Scanner sc = new Scanner(System.in);
    private PaymentCard paymentCard;
    private Customer customer;
    private Quote quote;
    private Order order;
    private String address;
    private String emailAddress;
    private int accountID;

    public CustomerAccount(PaymentCard paymentCard, Customer customer, String address, String emailAddress) {
        this.paymentCard = paymentCard;
        this.customer = customer;
        this.quote = quote; //Account can exist without a quote
        this.order = order; //Account can exist without an order
        this.address = address;
        this.emailAddress = emailAddress;
        this.accountID = generateAccountID();
    }

//    public Customer userRegistration(){
//        System.out.println("Enter first name");
//        String firstName = sc.nextLine();
//        System.out.println("Enter surname");
//        String surname = sc.nextLine();
//        return new Customer(firstName, surname);
//    }


    public int generateAccountID(){
        int min = 1000000;
        int max = 9999999;

        int idNumber = (int)Math.random() * ( max - min );
        return idNumber;
    }




}
