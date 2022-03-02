package com.zyf.pattern.structural.facade;

public class GiftExchangelManager {
    private ShippingService shippingService = new ShippingService();
    private PointsPaymentService paymentService = new PointsPaymentService();
    private QualifyService qualifyService = new QualifyService();

    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if (paymentService.pay(pointsGift)){
                //积分支付成功
                String orderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号："+orderNo);
            }

        }
    }
}
