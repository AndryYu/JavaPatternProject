package com.zyf.design.principle.demeter;

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
