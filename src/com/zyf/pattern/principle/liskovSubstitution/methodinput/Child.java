package com.zyf.pattern.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base{
    //重写
   /* @Override
    public void method(HashMap map) {
        System.out.println("子类hashMap方法被执行");
    }*/

    //重载
    public void method(Map map) {
        System.out.println("子类Map方法被执行");
    }
}