package com.zyf.design.pattern.behavior.state;

public class PlayState extends CourseVideoState{

    @Override
    public void play() {
        System.out.println("正常播放状态");
    }

    @Override
    public void stop() {
        this.courseVideContext.setState(CourseVideContext.STOP_STATE);
    }
}
