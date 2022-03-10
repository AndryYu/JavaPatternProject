package com.zyf.design.pattern.structural.proxy.dynamicproxy;

import com.zyf.design.pattern.structural.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }


    private void beforeMethod(Object object){
        System.out.println("动态代理 before code");
        int userId = 0;
        if (object instanceof  Order) {
            userId = ((Order)object).getUserId();
        }
        int dbRouter = userId%2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }

}
