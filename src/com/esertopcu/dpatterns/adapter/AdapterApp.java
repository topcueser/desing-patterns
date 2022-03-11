package com.esertopcu.dpatterns.adapter;

public class AdapterApp {
    public static void main(String[] args) {

        /*
        - Bir sınıfın arayüzünü istemcinin beklediği arayüze çevirmeye yarar.
        - Farklı sistemleri kendi sistemimize dahil ederken bazen yapılar uyuşmayabiliyor.
          Buradaki yapılar arayüzler olabilir. Bu desenin amacı arayüz için bir adapter oluşturarak sanki kendi
          sistemimize aitmiş gibi çalıştırmayı sağlar. Özetle; uyumsuz bir yapıyı,
          istemcinin beklediği bir yapıya getirir.
        * */

        // Örnek Senaryo
        /*
        * Geliştirdiğimiz uygulamada JSON işlemleri için sistemimizin IJsonSerializer arayüzünü kullandığını düşünelim.
        * İlerleyen süreçte bu işlemleri gerçekleştirmek için 3. parti bir yazılım kullanmak istediniz fakat daha sonradan
        * eklediğiniz yapı sisteminiz ile uyumsuz çünkü sistem IJsonSerializer arayüzünü uyguluyor fakat
        * yeni gelen yapı bunu uygulamamaktadır ve yeni gelen yapıya da müdahalede bulunamıyorsunuz.
        * Bu sorunu adapter çözüme götürebiliriz.
        * */

        SerializerOperation serializerOperation1 = new SerializerOperation(new SystemSerializer());
        String serializedObject1 = serializerOperation1.serializeObject(new Object());
        System.out.println(serializedObject1);

        SerializerOperation serializerOperation2 = new SerializerOperation(new ThirdPartySerializerAdapter());
        String serializedObject2 = serializerOperation2.serializeObject(new Object());
        System.out.println(serializedObject2);

    }
}
