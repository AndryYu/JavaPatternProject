package com.zyf.design.pattern.behavior.command;

public class CloseCourseVideoCommand implements Command{
    
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void excute() {
        courseVideo.close();
    }
}
