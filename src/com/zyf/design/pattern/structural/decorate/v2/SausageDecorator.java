package com.zyf.design.pattern.structural.decorate.v2;

public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String geDesc() {
        return super.geDesc()+" 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
