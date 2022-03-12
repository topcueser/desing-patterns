package com.esertopcu.dpatterns.bridge;

public class EmailMessageSender implements MessageSender{

    @Override
    public void sendMessage(Message message) {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}
