package com.zyf.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

public class Base {
    public void method(HashMap map){
        System.out.println("父类方法被执行");
    }
}
