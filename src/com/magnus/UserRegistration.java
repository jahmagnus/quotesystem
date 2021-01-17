package com.magnus;

import java.util.Scanner;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);

    public CustomerAccount createNewCustomerAccount(){
        PaymentCard paymentCard = loadPaymentCard();
        Customer customer = createCustomer();
        System.out.println("Address");
        String address = sc.next();
        System.out.println("Email");
        String email = sc.next();
        return new CustomerAccount(paymentCard, customer, address, email);
    }

    public PaymentCard loadPaymentCard(){
//        private String name;
//        private String cardNumber;
//        private String expiryDate;
//        private int securityNumber;
        System.out.println("Please enter name on card");
        String name = sc.nextLine();
        System.out.println("Please enter card number");
        String cardNumber = sc.nextLine();
        System.out.println("Enter expiry date");
        String expiryDate = sc.nextLine();
        System.out.println("Enter security number");
        int securityNumber = sc.nextInt();;
        return new PaymentCard(name, cardNumber, expiryDate, securityNumber);

    }

    public Customer createCustomer(){
        System.out.println("Customer first name");
        String name = sc.nextLine();
        System.out.println("Customer surname");
        String surname = sc.nextLine();
        return new Customer(name, surname);
    }

}
