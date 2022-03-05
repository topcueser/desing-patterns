package com.esertopcu.dpatterns.factory;

public class Xiaomi implements Mobile{

    private final String name;
    private final double price;

    public Xiaomi(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
