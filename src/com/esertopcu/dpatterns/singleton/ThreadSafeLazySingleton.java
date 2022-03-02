package com.esertopcu.dpatterns.singleton;

public class ThreadSafeLazySingleton {

    private static volatile ThreadSafeLazySingleton singleton;

    private static int count;
    private String name;

    private ThreadSafeLazySingleton() {
        count++;
        name = "ThreadSafeLazySingleton: " + count;
    }

    public static ThreadSafeLazySingleton getInstance() {
        synchronized (ThreadSafeLazySingleton.class) {
            if(singleton == null){
                singleton = new ThreadSafeLazySingleton();
            }
        }
        return singleton;
    }

    public void doSomething() {
        System.out.println("ThreadSafeLazySingleton doSomething: " + name);
    }
}
