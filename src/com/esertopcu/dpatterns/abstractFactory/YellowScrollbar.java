package com.esertopcu.dpatterns.abstractFactory;

public class YellowScrollbar implements Scrollbar{
    @Override
    public void getName() {
        System.out.println("Created Scrollbar -> YellowScrollbar");
    }
}
