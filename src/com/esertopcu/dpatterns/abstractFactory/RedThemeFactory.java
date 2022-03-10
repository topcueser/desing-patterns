package com.esertopcu.dpatterns.abstractFactory;

public class RedThemeFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new RedScrollbar();
    }
}
