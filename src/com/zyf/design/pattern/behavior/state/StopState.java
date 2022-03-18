package com.zyf.design.pattern.behavior.state;

public class StopState extends CourseVideoState{

    @Override
    public void play() {
        this.courseVideContext.setState(CourseVideContext.PLAY_STATE);
    }

    @Override
    public void stop() {
        System.out.println("暂停播放状态");
    }
}
