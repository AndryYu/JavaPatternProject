package com.zyf.design.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Android 入门");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);

        courses.add(freeCourse);
        courses.add(codingCourse);

        for (Course course:courses) {
            course.accept(new Visitor());
        }
    }
}
