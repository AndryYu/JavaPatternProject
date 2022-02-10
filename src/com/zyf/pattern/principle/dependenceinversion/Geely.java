package com.zyf.pattern.principle.dependenceinversion;

public class Geely {
    //v1
    public void studyJavaCourse(){
        System.out.println("Geely在学习Java课程");
    }

    public void studyJsCourse(){
        System.out.println("Geely在学习Js课程");
    }

    //v2
    public void studyImoocCourse(ICourse course){
        course.studyCourse();
    }

    //v3
    ICourse course;

    public Geely(ICourse course){
        this.course = course;
    }

    // v4
    public Geely(){

    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyImoocCourse(){
        course.studyCourse();
    }
}
