package com.zyf.pattern.creational.factorymethod;


public class JavaVideo extends Video {
    @Override
    void produce() {
        System.out.println("录制 Java 课程");
    }
}
