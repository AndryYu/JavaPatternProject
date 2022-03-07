package com.zyf.pattern.structural.decorate.v2;

public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String geDesc() {
        return super.geDesc()+ " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
