package com.zyf.design.pattern.behavior.strategy;

public class ManJianStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }
}
