package com.esertopcu.dpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BuilderApp {
    public static void main(String[] args) {

        /*
        Nesne tabanlı programlamanın özü sınıflara dayanır. Sınıflardan nesneler yaratırız.
        Bunu yapmak için de constructorları kullanırız.
        Sınıfımızda bulunan field sayısı fazla olursa bundan dolayı birden çok constructora ihtiyaç duyabiliriz.
        Haliyle her bir field eklendiğinde yeni bir constructor ekleme ihtiyacı hissedebiliriz.
        Çünkü nesneyi oluştururken hangi field başta atama yapılacak ya da yapılmayacak bilemeyebiliriz.
        İşte bu uzayıp giden parametre sayısından, karmaşık constructorlardan kurtarmak için
        Builder Pattern güzel bir çözüm sunuyor.
        Problem gereksinim adımları
        1-) Çok fazla parametre alan objeniz varsa
        2-) Farklı parametre kombinasyonlarına sahip birden çok constructorınız varsa
        3-) Nesnenin oluşturulduktan sonra değişmez (immutable) olmasını istiyorsanız
        * */

        // Aşağıdaki örnekler bu constructor üzerinden nesne oluşturmaya örnek.

        Product product1 = new Product(
                "Effective Java",
                "Java Book",
                LocalDateTime.now(),
                true,
                new BigDecimal(100));

        System.out.println(product1.toString());

        Product product2 = new Product("Microservices Pattern", true, new BigDecimal(200));

        System.out.println(product2.toString());

        // Aşağıdaki örnekler Builder kullanarak oluşturuluyor

        ProductWithBuilder product3 = new ProductWithBuilder.Builder()
                .name("Head First Design Patterns")
                .description("Building Extensible and Maintainable Object-Oriented Software")
                .inStock(true)
                .build();

        System.out.println(product3.toString());

        ProductWithBuilder product4 = new ProductWithBuilder.Builder()
                .name("Clean Code")
                .price(new BigDecimal(500))
                .build();

        System.out.println(product4.toString());
    }
}
