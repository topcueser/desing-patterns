package com.esertopcu.dpatterns.singleton;

public class ThreadedLazySingleton {

    private static ThreadedLazySingleton singleton;

    private static int count;
    private String name;

    private ThreadedLazySingleton() {
        count++;
        name = "ThreadedLazySingleton: " + count;
    }

    public static ThreadedLazySingleton getInstance() {
        if(singleton == null){
            singleton = new ThreadedLazySingleton();
        }
        return singleton;
    }

    public void doSomething() {
        System.out.println("ThreadedLazySingleton doSomething: " + name);
    }

    // Problemi
    // Farklı kanallar aynı anda istek gönderdiğinde null kontrolü delineceği için birden fazla instance oluşabilir.
    // Çözüm:
    // getInstance() içerisine synchronized ile tüm method yada belirlenen kapsamın(scope) aynı anda sadece bir kanal tarafından
    // çalıştırılmasını sağlar.
    // Örnek:
}
