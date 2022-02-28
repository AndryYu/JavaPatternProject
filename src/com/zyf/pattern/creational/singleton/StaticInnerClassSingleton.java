package com.zyf.pattern.creational.singleton;

public class StaticInnerClassSingleton {
    public static  class  InnerClass{
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){
        if (InnerClass.singleton!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }
}
