package com.esertopcu.dpatterns.facade;

public class ShippingCompany {

    private final String name;

    public ShippingCompany(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
