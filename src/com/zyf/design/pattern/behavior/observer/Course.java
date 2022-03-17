package com.zyf.design.pattern.behavior.observer;

import java.util.Observable;

public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Question question){
        System.out.println(question.getUserName() + "在" + courseName + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
