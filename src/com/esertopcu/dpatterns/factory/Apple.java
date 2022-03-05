package com.esertopcu.dpatterns.factory;

public class Apple implements Mobile{

    private final String name;
    private final double price;

    public Apple(String name, double price) {
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
