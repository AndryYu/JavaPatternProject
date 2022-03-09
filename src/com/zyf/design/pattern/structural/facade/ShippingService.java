package com.zyf.design.pattern.structural.facade;

public class ShippingService {
    public String shipGift(PointsGift pointsGift){

        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = System.currentTimeMillis()+"";
        return shippingOrderNo;
    }
}
