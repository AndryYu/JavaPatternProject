package com.zyf.design.pattern.creational.factoryabstract;

public class Test {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.produce();
        article.produce();
    }
}
