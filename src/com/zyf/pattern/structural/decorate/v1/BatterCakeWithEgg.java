package com.zyf.pattern.structural.decorate.v1;

import com.zyf.pattern.structural.decorate.v1.BatterCake;

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
