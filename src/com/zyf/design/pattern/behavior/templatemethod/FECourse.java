package com.zyf.design.pattern.behavior.templatemethod;

public class FECourse extends ACourse{


    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
    }
}
