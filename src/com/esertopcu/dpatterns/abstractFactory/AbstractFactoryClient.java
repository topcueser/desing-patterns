package com.esertopcu.dpatterns.abstractFactory;

public class AbstractFactoryClient {

    private Button button;
    private Scrollbar scrollbar;

    public AbstractFactoryClient(GUIFactory factory) {
        this.button = factory.createButton();
        this.scrollbar = factory.createScrollbar();
    }

    public void getName() {
        button.getName();
        scrollbar.getName();
    }
}
