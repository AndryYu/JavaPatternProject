package com.zyf.design.pattern.behavior.command;

public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式");
        OpenCourseVideoCommand openCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);

        staff.excuteCommands();
    }
}

