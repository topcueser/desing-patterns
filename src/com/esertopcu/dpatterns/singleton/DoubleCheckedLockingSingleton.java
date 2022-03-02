package com.esertopcu.dpatterns.singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton singleton;

    private static int count;
    private String name;

    private DoubleCheckedLockingSingleton() {
        count++;
        name = "DoubleCheckedLockingSingleton: " + count;
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        // Unsynchronized null check is faster
        if (singleton == null) {
            // Less synchronized area is better
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null){
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }

    public void doSomething() {
        System.out.println("DoubleCheckedLockingSingleton doSomething: " + name);
    }
}
