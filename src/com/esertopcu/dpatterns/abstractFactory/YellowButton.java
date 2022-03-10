package com.esertopcu.dpatterns.abstractFactory;

public class YellowButton implements Button{
    @Override
    public void getName() {
        System.out.println("Created Button -> RedButton");
    }
}
