package com.zyf.design.pattern.structural.proxy;

import com.zyf.design.pattern.structural.proxy.dynamicproxy.OrderServiceDynamicProxy;
import com.zyf.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        //静态代理
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);

        System.out.println("");
        order.setUserId(2);
        //动态代理
        IOrderService dynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);

    }

}
