package com.zyf.pattern.creational.factorymethod;


public class PythonVideo extends Video {
    @Override
    void produce() {
        System.out.println("录制 Python 课程");
    }
}
