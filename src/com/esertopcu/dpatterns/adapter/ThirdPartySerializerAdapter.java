package com.esertopcu.dpatterns.adapter;

public class ThirdPartySerializerAdapter implements JsonSerializer{

    @Override
    public String serializeObject(Object object) {
        ThirdPartySerializer thirdPartySerializer = new ThirdPartySerializer();
        return thirdPartySerializer.serialize(object);
    }
}
