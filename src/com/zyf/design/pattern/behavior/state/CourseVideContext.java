package com.zyf.design.pattern.behavior.state;

public class CourseVideContext {

    private  CourseVideoState state;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();

    public CourseVideoState getState() {
        return state;
    }

    public void setState(CourseVideoState state) {
        this.state = state;
        this.state.setCourseVideContext(this);
    }

    public void play(){
        this.state.play();
    }

    public void stop(){
        this.state.stop();
    }

}
