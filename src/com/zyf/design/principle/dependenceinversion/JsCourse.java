package com.zyf.design.principle.dependenceinversion;

public class JsCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Js课程");
    }
}
