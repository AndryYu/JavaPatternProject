package com.zyf.pattern.creational.singleton;

public class LazyLockSingleton {
    private static LazyLockSingleton lazyLockSingleton = null;

    private LazyLockSingleton(){
    }

    public synchronized static LazyLockSingleton getInstance(){
        if (lazyLockSingleton ==null){
            lazyLockSingleton = new LazyLockSingleton();
        }
        return lazyLockSingleton;
    }
}
