package com.zyf.design.pattern.behavior.state;

public abstract class CourseVideoState {
    protected CourseVideContext courseVideContext;

    public void setCourseVideContext(CourseVideContext courseVideContext) {
        this.courseVideContext = courseVideContext;
    }

    public abstract void play();

    public abstract void stop();
}
