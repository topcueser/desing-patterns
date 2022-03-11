package com.esertopcu.dpatterns.adapter;

public class SystemSerializer implements JsonSerializer{
    @Override
    public String serializeObject(Object object) {
        return "serialized with SystemSerializer";
    }
}
