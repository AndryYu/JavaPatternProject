package com.zyf.design.pattern.behavior.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start-----");
        ACourse course = new DesignPatternCourse();
        course.makeCourse();
        System.out.println("后端设计模式课程end-----");
        System.out.println();

        System.out.println("前端设计模式课程start-----");
        ACourse fCourse = new FECourse();
        fCourse.makeCourse();
        System.out.println("前端设计模式课程end-----");
    }
}
