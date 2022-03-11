package com.esertopcu.dpatterns.adapter;

public class SerializerOperation {

    private final JsonSerializer jsonSerializer;

    public SerializerOperation(JsonSerializer jsonSerializer) {
        this.jsonSerializer = jsonSerializer;
    }

    public String serializeObject(Object object) {
        return jsonSerializer.serializeObject(object);
    }
}
