package com.zyf.design.pattern.behavior.command;

public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void excute() {
        courseVideo.open();
    }
}
