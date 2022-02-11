package com.zyf.pattern.principle.liskovSubstitution.methodoutput;

import java.util.HashMap;

public class Child extends Base{
    @Override
    public HashMap method() {
        HashMap map = new HashMap();
        System.out.println("子类method被执行");
        map.put("message","子类method被执行");
        return map;
    }
}
