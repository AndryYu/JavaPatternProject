package com.zyf.design.pattern.creational.prototype;

import java.io.Serializable;

public class HungrySingleton implements Serializable,Cloneable {
    private  final static HungrySingleton singleton ;

    //类加载的时候初始化
    static {
        singleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if (singleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return  singleton;
    }

    private Object readResolve(){
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用super.clone会破坏单例
        return getInstance();
    }
}
