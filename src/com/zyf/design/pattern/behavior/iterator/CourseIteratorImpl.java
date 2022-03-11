package com.zyf.design.pattern.behavior.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator{

    private List<Course> courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是："+position);
        course = courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        return position >= courseList.size();
    }
}
