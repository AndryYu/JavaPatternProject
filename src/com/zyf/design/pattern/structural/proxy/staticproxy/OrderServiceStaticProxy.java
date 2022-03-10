package com.zyf.design.pattern.structural.proxy.staticproxy;

import com.zyf.design.pattern.structural.proxy.IOrderService;
import com.zyf.design.pattern.structural.proxy.Order;
import com.zyf.design.pattern.structural.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }


    private void beforeMethod(Order order){
        System.out.println("静态代理 before code");
        int userId = order.getUserId();
        int dbRouter = userId%2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
