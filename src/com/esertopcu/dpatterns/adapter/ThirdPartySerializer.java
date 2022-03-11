package com.esertopcu.dpatterns.adapter;

public class ThirdPartySerializer {

    // Sisteme daha sonradan dahil olan yapı.
    // Sistemin kullandığı arayüzü uygulamamaktadır.

    public String serialize(Object object) {
        return "serialized with ThirdPartySerializer";
    }
}
