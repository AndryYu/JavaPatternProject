package com.zyf.design.pattern.behavior.visitor;

public class Visitor implements IVisitor{
    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程："+course.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("收费课程："+codingCourse.getName() +" 价格"+codingCourse.getPrice());
    }
}
