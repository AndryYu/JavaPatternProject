package com.zyf.design.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift gift = new PointsGift("T恤");
        GiftExchangelManager manager = new GiftExchangelManager();

        manager.giftExchange(gift);
    }
}
