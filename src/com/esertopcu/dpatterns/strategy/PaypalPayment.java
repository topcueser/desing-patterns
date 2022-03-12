package com.esertopcu.dpatterns.strategy;

public class PaypalPayment implements PaymentMethod {

    private final String email;
    private final String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " is paid using Paypal");
    }
}
