package com.zyf.pattern.structural.decorate.v2;

public class BatterCake extends ABatterCake{
    public String geDesc(){
        return "煎饼";
    }

    public int cost(){
        return 8;
    }
}
