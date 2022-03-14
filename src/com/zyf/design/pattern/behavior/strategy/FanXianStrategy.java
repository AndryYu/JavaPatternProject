package com.zyf.design.pattern.behavior.strategy;

public class FanXianStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
