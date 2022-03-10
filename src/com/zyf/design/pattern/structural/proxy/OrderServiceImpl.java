package com.zyf.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService{
    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入,课程直接new
        orderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加order");
        return orderDao.insert(order);
    }
}
