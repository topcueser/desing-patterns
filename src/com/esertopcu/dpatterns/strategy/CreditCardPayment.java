package com.esertopcu.dpatterns.strategy;

public class CreditCardPayment implements PaymentMethod {

    private final String name;
    private final String cardNumber;
    private final String cvv;
    private final String dateOfExpiry;

    public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " is paid using CreditCard: " + cardNumber);
    }
}
