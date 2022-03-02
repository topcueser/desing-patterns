package com.esertopcu.dpatterns.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private static int count;
    private String name;

    private LazyInitializationSingleton() {
        count++;
        name = "LazySingleton: " + count;
    }

    public static LazyInitializationSingleton getInstance() {
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("LazyInitializationSingleton doSomething: " + name);
    }

    // Problemi
    // Multi-threaded ortamlarda aynı anda birden fazla kanalın null kontrolü yapmasından dolayı birden fazka nesne oluşmasına
    // sebep olur.
    // Örnek : ThreadedLazySingleton.java
}
