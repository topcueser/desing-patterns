package com.esertopcu.dpatterns.bridge;

public class BridgeApp {
    public static void main(String[] args) {

        /*
        Bridge tasarım deseni, soyutlanmış (abstract) yapıyı implementasyonundan (uygulamasından) ayırmaya,
        bağımsız olarak geliştirilebilir iki yapı elde etmemize yarar.
        * */

        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();

    }
}
