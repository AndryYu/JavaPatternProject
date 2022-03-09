package com.zyf.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Manager getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null){
            manager = new Manager(department);
            manager.setReportContent("部门："+department+"作报告。。。");
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }

}
