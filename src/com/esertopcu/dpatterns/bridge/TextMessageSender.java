package com.esertopcu.dpatterns.bridge;

public class TextMessageSender implements MessageSender{

    @Override
    public void sendMessage(Message message) {
        System.out.println("TextMessageSender: Sending text message...");
    }
}
