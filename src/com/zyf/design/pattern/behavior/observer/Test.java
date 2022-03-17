package com.zyf.design.pattern.behavior.observer;

public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Andy");
        Teacher teacher1 = new Teacher("Lisa");

        course.addObserver(teacher);
        course.addObserver(teacher1);

        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("观察者模式如何实现");

        course.produceQuestion(question);
    }
}
