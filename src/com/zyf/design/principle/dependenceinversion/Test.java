package com.zyf.design.principle.dependenceinversion;

public class Test {

    public static void main(String[] args) {
        //V1
        /*Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyJsCourse();*/

        //v2  接口方法
        /*Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new JsCourse());*/

        //v3 构造器
        /*Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();*/

        //v4 set
        Geely geely = new Geely();
        geely.setCourse(new JsCourse());
        geely.studyImoocCourse();
        geely.setCourse(new JavaCourse());
        geely.studyImoocCourse();
    }
}
