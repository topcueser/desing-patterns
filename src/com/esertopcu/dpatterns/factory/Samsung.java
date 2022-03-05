package com.esertopcu.dpatterns.factory;

public class Samsung implements Mobile{

    private final String name;
    private final double price;

    public Samsung(String name, double price) {
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
