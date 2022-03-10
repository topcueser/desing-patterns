package com.esertopcu.dpatterns.abstractFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

        /*
        Abstract factory design pattern’i anlatırken ister istemez Factory design pattern’ine de değinmiş olacağız
        Factory design pattern’de tek bir ürün ailesine ait tek bir arayüz mevcutken,abstract factory’de
        farklı ürün aileleri için farklı arayüzler mevcuttur.
        * */

        // Abstract Factory
        /*
        Birden fazla ürün ailesi ile çalışmak durumunda kaldığımızda , ürün ailesi ile istemci tarafını soyutlamak için kullanılır.
        Ürün ailelerinin oluşumunu istemci tarafından ayırarak, karar verme koşulu olmadan, esnek ve geliştirilebilir bir yapı kurmamızı sağlar.
        * */

        RedThemeFactory redThemeFactory = new RedThemeFactory();
        AbstractFactoryClient abstractFactoryClient = new AbstractFactoryClient(redThemeFactory);
        abstractFactoryClient.getName();

    }
}
