package com.esertopcu.dpatterns.strategy;

public class Product {

    private final String name;
    private final String upcCode;
    private final double price;

    public Product(String name, String upcCode, double price) {
        this.name = name;
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public double getPrice() {
        return price;
    }
}
