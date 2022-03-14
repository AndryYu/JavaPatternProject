package com.zyf.design.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static final Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN,new LiJianStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanXianStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManJianStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String key){
        return PROMOTION_STRATEGY_MAP.get(key);
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
