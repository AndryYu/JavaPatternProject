package com.zyf.design.pattern.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
