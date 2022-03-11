package com.zyf.design.pattern.behavior.iterator;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java电商一期");
        Course course2 = new Course("Java电商二期");
        Course course3 = new Course("Java设计模式精讲");
        Course course4 = new Course("Java数据结构与算法");
        Course course5 = new Course("前端开发");
        Course course6 = new Course("Android开发");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("----课程列表----");
        printCourses(courseAggregate);

        courseAggregate.removeCourse(course5);
        courseAggregate.removeCourse(course6);


        System.out.println("----删除操作之后的课程列表----");
        printCourses(courseAggregate);
    }

    public static void printCourses(CourseAggregate aggregate){
        CourseIterator iterator = aggregate.getCourseIterator();
        while (!iterator.isLastCourse()){
            Course course = iterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
