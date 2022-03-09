package com.zyf.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap map = new HashMap();
        child.method(map);
    }
}
