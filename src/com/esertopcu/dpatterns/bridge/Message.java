package com.esertopcu.dpatterns.bridge;

public abstract class Message {

    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}
