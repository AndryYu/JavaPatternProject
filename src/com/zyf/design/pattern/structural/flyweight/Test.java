package com.zyf.design.pattern.structural.flyweight;

import java.util.Random;

public class Test {
    private static  final  String department[] = {"研发部","市场部","财务部"};

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            String depart = department[new Random().nextInt(3)];

            Employee employee = EmployeeFactory.getManager(depart);
            employee.report();
        }
    }
}
