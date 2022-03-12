package com.esertopcu.dpatterns.strategy;

import java.util.Arrays;
import java.util.List;

public class StrategyApp {
    public static void main(String[] args) {

        /*
        * Strategy tasarım deseni, bir algoritma ailesi tanımlamamızı, her birini ayrı bir sınıfa koymamızı ve nesnelerinin
        * birbiriyle değiştirilebilir hale getirmenizi sağlayan davranışsal bir tasarım modelidir.
        * */

        /*
        * Bir işlemin birden fazla yapılması, çalışma zamanında algoritma değişikliği gibi durumlarda kullanılır,
        * karışık if-else durumundan da kurtarır. Soyutlamadan dolayı da Loosely Coupled bir uygulama halini alır.
        * */

        /*
        * Örnek Senaryo;
        *
        * Alınan ürünlerin ödenmesi için bir sayfa hazırlandığını düşünelim ve ödeme tarafında kredi kartı kullanılsın.
        * Yani hiçbir entegratör kullanmadan direk kendimiz banka ile ödeme sağlıyoruz.
        * İlerleyen zamanlarda başka bir ihtiyaçtan dolayı PayPal eklediğimizi düşünelim. Bu durumda yukarıda belirttiğimiz gibi
        * kodumuzun içerisine if else ler eklemek yani Open/Closed prensibine uymak adına strategy desenini kullabiliriz.
        *
        * */

        ShoppingCart shoppingCart1 = new ShoppingCart();

        Product product1 = new Product("Book", "173400017", 100);
        Product product2 = new Product("Pencil", "173400018", 10.5);

        //1.yol
        shoppingCart1.addProduct(product1);
        shoppingCart1.addProduct(product2);

        //2.yol
        //List<Product> products = Arrays.asList(product1,product2);
        //shoppingCart1.addListProduct(products);

        shoppingCart1.payment(new CreditCardPayment("Eser Topçu", "1010101010101010", "000", "04/22"));

        System.out.println("------------------------------");

        shoppingCart1.payment(new PaypalPayment("topcueser@gmail.com", "12345"));

    }
}
