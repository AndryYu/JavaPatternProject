package com.zyf.design.pattern.creational.factoryabstract;

public class JavaVideo  extends Video{
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
