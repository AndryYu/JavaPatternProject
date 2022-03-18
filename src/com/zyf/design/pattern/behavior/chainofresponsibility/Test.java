package com.zyf.design.pattern.behavior.chainofresponsibility;


public class Test {
    public static void main(String[] args) {
         Approver article = new ArticleApprover();
         Approver video = new VideoApprover();

         Course course = new Course();
         course.setName("Java设计模式--By Geely");
         course.setArticle("Java设计模式手记");
         //course.setVideo("Java设计模式精讲视频");

         article.setNextApprover(video);
         article.deploy(course);
    }
}
