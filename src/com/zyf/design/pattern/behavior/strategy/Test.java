package com.zyf.design.pattern.behavior.strategy;

import org.apache.commons.lang3.StringUtils;

public class Test {
    public static void main(String[] args) {
        //实现1
        /*PromotionManager promotion618 = new PromotionManager(new ManJianStrategy()) ;
        PromotionManager promotion1111 = new PromotionManager(new FanXianStrategy()) ;

        promotion618.executePromotion();
        promotion1111.executePromotion();*/

        //实现2
        /*PromotionManager promotion = null;
        String promotionKey = "LIJIAN";

        if (StringUtils.equals(promotionKey,"LIJIAN")){
            promotion = new PromotionManager(new LiJianStrategy());
        }else if (StringUtils.equals(promotionKey,"FANXIAN")){
            promotion = new PromotionManager(new FanXianStrategy());
        }//...
        if (promotion != null) {
            promotion.executePromotion();
        }*/


        String promotionKey = "LIJIAN";
        PromotionManager promotion = new PromotionManager(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotion.executePromotion();
    }
}
