package com.esertopcu.dpatterns.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeApp {
    public static void main(String[] args) {

        /*
        Facade tasarım deseni, sistemin karmaşıklıklarını gizler ve istemciye sisteme erişebilecekleri bir ara birim sağlar.
        Bu tasarım modeli, bu modelin karmaşıklığını gizlemek için mevcut sisteme bir arayüz eklediği için, yapısal modelin altında gelir.
        * */

        /*
        1-) Bankaya gerekli bilgileri gönder ve onay al.
        2-) Müşteri nesnesini oluştur.
        3-) Seçilen kargo şirketini de nesne olarak oluştur.
        4-) Oluşturulan siparişi veritabanına ekle ve yeni Sipariş id’sini bellekte tut.
        5-) Yeni sipariş id’si ile satın alınan tüm ürünleri ilişkilendir ve veritabanına ekle.
        6-) İşlemi tamamla.
        * */

        /*
        Bu yedi adımın da farklı nesnelerin sorumluluğunda olduğunu düşünürsek, her sipariş verme işleminde bu adımları tekrar tekrar kurgulamak işimizi oldukça karmaşıklaştırır.
        Bunun yerine tüm bu adımları yerine getiren bir nesne inşa edebilirsiniz. O nesneniz Facade olur.
        * */

        List<CartItem> cartItems = new ArrayList<>();
        cartItems.add(new CartItem("Book", 1, 100));
        cartItems.add(new CartItem("Tshirt", 3, 80));
        cartItems.add(new CartItem("Pencil", 5, 20.5));

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder("Eser", "X Cargo", cartItems);
    }
}
