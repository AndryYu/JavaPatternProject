package com.zyf.design.pattern.behavior.iterator;

public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();
}
