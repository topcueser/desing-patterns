package com.esertopcu.dpatterns.singleton;

public class SingletonApp {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //EagerInitializationSingleton.getInstance().doSomething();
            LazyInitializationSingleton.getInstance().doSomething();
        }
    }
}

class ThreadedLazySingletonApp extends Thread{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new ThreadedLazySingletonApp().start();
        }
    }

    public void run() {
        ThreadedLazySingleton ls = ThreadedLazySingleton.getInstance();
        ls.doSomething();
    }
}

class ThreadedSafeLazySingletonApp extends Thread{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new ThreadedSafeLazySingletonApp().start();
        }
    }

    public void run() {
        ThreadSafeLazySingleton ls = ThreadSafeLazySingleton.getInstance();
        ls.doSomething();
    }
}

class DoubleCheckedLockingSingletonApp extends Thread{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new DoubleCheckedLockingSingletonApp().start();
        }
    }

    public void run() {
        DoubleCheckedLockingSingleton ls = DoubleCheckedLockingSingleton.getInstance();
        ls.doSomething();
    }
}
