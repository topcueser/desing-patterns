package com.esertopcu.dpatterns.abstractFactory;

public class YellowThemeFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new YellowButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new YellowScrollbar();
    }
}
