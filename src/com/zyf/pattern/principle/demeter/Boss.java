package com.zyf.pattern.principle.demeter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        //优化前
        /*List<Course> courseList = new ArrayList<>();
        for (int i=0;i<20;i++){
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);*/

        teamLeader.checkNumberOfCourses();
    }
}
