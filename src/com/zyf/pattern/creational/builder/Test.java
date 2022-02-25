package com.zyf.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach =  new Coach();
        coach.setCourseBuilder(builder);

        Course course = coach.makeCourse("Java设计模式精讲","" +
                "Java设计模式精讲PPT","Java设计模式精讲视频",
                "Java设计模式精讲手记","Java设计模式精讲问答");
        System.out.println(course);

        //链式调用
        CourseEx courseEx = new CourseEx.CourseBuilderEx()
                .buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseArticle("Java设计模式精讲手记")
                .buildCourseVideo("Java设计模式精讲视频")
                .buildCourseQA("Java设计模式精讲问答")
                .makeCourse();
        System.out.println(courseEx);
    }
}
