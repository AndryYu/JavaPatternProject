package com.zyf.pattern.structural.decorate.v1;

public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    public String geDesc() {
        return super.geDesc()+" 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
