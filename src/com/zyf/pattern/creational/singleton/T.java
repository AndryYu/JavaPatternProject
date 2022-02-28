package com.zyf.pattern.creational.singleton;

public class T implements Runnable{
    @Override
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //System.out.println(Thread.currentThread().getName()+" "+lazySingleton);

        //ContainerSingleton.putInstance("key",new Object());
        //Object instance = ContainerSingleton.getInstance("key");

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}
