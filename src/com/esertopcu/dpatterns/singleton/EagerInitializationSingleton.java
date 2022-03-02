package com.esertopcu.dpatterns.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private static int count;
    private String name;

    private EagerInitializationSingleton() {
        count++;
        name = "Singleton: " + count;
    }

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("EagerInitializationSingleton doSomething: " + name);
    }

    // Problemleri
    // 1-) private static olduğu için nesneye ihtiyaç duyulmadan program ayağa kalktığında ilk static yapılar
    // oluşturulur ve bekletilir, bu da hafıza işgali problemine neden olabilir
    // O zaman burada ihtiyaç duyulana kadar nesnenin oluşturulması bekletilir (Lazy Loading) sonradan yükleme olması gerekir.
    // Örnek : LazyInitializationSingleton.java
}
