package com.esertopcu.dpatterns.abstractFactory;

public class RedButton implements Button{
    @Override
    public void getName() {
        System.out.println("Created Button -> RedButton");
    }
}
