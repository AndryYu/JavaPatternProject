package com.zyf.design.pattern.behavior.state;


public class Test {
    public static void main(String[] args) {
        CourseVideContext courseVideContext = new CourseVideContext();
        courseVideContext.setState(CourseVideContext.PLAY_STATE);

        System.out.println("当前状态："+courseVideContext.getState().getClass().getSimpleName());

        courseVideContext.stop();
        System.out.println("当前状态："+courseVideContext.getState().getClass().getSimpleName());

    }
}
