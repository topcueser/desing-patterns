package com.esertopcu.dpatterns.factory;

public class MobilePhoneFactory {

    private MobilePhoneFactory() {

    }

    public static Mobile getMobilePhone(MobilePhoneType type, String name, double price) {
        return switch (type) {
            case APPLE   -> new Apple(name, price);
            case SAMSUNG -> new Samsung(name, price);
            case XIAOMI  -> new Xiaomi(name, price);
        };
    }
}
