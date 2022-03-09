package com.zyf.design.pattern.structural.decorate.v1;

public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String geDesc() {
        return super.geDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
