package com.zyf.pattern.structural.facade;

public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName()+"积分");
        return true;
    }
}
