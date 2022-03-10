package com.esertopcu.dpatterns.abstractFactory;

public class RedScrollbar implements Scrollbar{
    @Override
    public void getName() {
        System.out.println("Created Scrollbar -> RedScrollbar");
    }
}
