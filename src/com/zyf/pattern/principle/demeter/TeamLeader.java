package com.zyf.pattern.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    //优化前
    public void checkNumberOfCourses(List<Course> courseList){
        System.out.println("在线课程的数量是："+courseList.size());
    }

    //优化后
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for (int i=0;i<20;i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+courseList.size());
    }
}
