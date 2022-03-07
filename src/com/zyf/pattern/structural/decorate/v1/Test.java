package com.zyf.pattern.structural.decorate.v1;

public class Test {
    public static void main(String[] args) {
        BatterCake cake = new BatterCake();
        System.out.println(cake.geDesc() + " 销售价格："+cake.cost());

        BatterCakeWithEgg cake1 = new BatterCakeWithEgg();
        System.out.println(cake1.geDesc() + " 销售价格："+cake1.cost());

        BatterCakeWithEggSausage cake2 = new BatterCakeWithEggSausage();
        System.out.println(cake2.geDesc() + " 销售价格："+cake2.cost());
    }
}
