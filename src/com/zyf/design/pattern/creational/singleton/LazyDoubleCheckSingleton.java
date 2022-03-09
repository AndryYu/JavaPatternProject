package com.zyf.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    //volatile 内存共享
    private volatile static  LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton (){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (singleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (singleton == null){
                    //1.分配内存给这个对象
                    //-----3.设置LazyDoubleCheckSingleton指向刚分配的对象
                    //2.初始化对象
                    //3.设置LazyDoubleCheckSingleton指向刚分配的对象
                    // 2和3互换位置不会影响
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
