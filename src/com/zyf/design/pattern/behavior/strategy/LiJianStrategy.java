package com.zyf.design.pattern.behavior.strategy;

public class LiJianStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
