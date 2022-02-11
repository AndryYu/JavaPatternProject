package com.zyf.pattern.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零开始学习",234.0);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID："+javaCourse.getId()
                +",名称："+javaCourse.getName()
                +",折后价格："+javaCourse.getDiscountPrice()
                +",原来价格："+javaCourse.getPrice());
    }
}
