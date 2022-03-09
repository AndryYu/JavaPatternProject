package com.zyf.design.pattern.structural.decorate.v2;

public class AbstractDecorator extends ABatterCake{
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    public String geDesc() {
        return aBatterCake.geDesc();
    }

    @Override
    public int cost() {
        return aBatterCake.cost();
    }
}
