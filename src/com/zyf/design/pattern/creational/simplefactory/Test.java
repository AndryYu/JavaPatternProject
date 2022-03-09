package com.zyf.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        /*Video video = new JavaVideo();
        video.produce();*/

        VideoFactory factory = new VideoFactory();
        Video video1 = factory.getVideo("java");
        if (video1 != null)
            video1.produce();

        Video video2 = factory.getVideo(PythonVideo.class);
        if (video2 != null)
            video2.produce();
    }
}
