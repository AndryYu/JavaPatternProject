package com.zyf.design.pattern.behavior.command;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name + "开放");
    }

    public void close(){
        System.out.println(this.name + "关闭");
    }
}
