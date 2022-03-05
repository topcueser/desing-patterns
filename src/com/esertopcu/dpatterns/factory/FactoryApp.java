package com.esertopcu.dpatterns.factory;

public class FactoryApp {
    public static void main(String[] args) {

        Mobile mobile1 = MobilePhoneFactory.getMobilePhone(MobilePhoneType.APPLE, "iPhone 13", 16000);
        System.out.println("Name: " + mobile1.getName() + " - Price: " + mobile1.getPrice());

        Mobile mobile2 = MobilePhoneFactory.getMobilePhone(MobilePhoneType.SAMSUNG, "Galaxy S22", 15000);
        System.out.println("Name: " + mobile2.getName() + " - Price: " + mobile2.getPrice());

        // Açıklamalar
        /*
        Tanım: Factory Method deseni, yazılım ortamında birden çok aynı özelliği gösterebilecek sınıflar için gerekli nesne
        üretiminin kalıtım yolu ile kalıtım yapılan nesne tarafından yapılmasını sağlamaktır.

        Senaryo: Telefon üreten bir yapımız olsun. Kullanıcı istediği telefonu seçebilir ve bu durum değişkenlik göstereceği için
        hangi telefonun nesnesinin gönderilmesi gerektiğini bilmiyoruz.

        Çözüm 1.adım => Mobile adında bir interface oluşturduk ve telefon bilgilerini gösteren metodlar ekledik. Her telefon burayı implement
        ederek bilgilerini göstermek durumunda
            2.adım => Apple-Samsung-Xiaomi sınıfları üzerinde gereli bilgiler doldurulur.
            3.adım => MobilePhoneFactory adında bir sınıf oluşturduk burada kullanıcının istediği özelliklere göre ilgili nesne döndürülecektir.
        * */

        // Dezavantaj
        /*
         -- Yeni bir telefon markası eklendiği zaman MobilePhoneFactory içerisinde yer alan switch yapısına ekleme yapılacak. Burda 100 markamız olsa
         100 tane case demek ve bu yapı da SOLID prensiplerinden Open-Closed prensibine uymamaktadır.
         Çözüm için Abstract Factory pattern geliştirişmiştir.
         */

    }
}
