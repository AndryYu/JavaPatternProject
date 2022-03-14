package com.zyf.design.pattern.behavior.strategy;

public class PromotionManager {
    private PromotionStrategy promotionStrategy;

    public PromotionManager(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void  executePromotion(){
        promotionStrategy.doPromotion();
    }
}
