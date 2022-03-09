package com.zyf.design.pattern.creational.builder;

public class CourseEx {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseQA;
    private String courseArticle;

    public CourseEx(CourseBuilderEx builderEx) {
        this.courseName = builderEx.courseName;
        this.coursePPT = builderEx.coursePPT;
        this.courseVideo = builderEx.courseVideo;
        this.courseArticle = builderEx.courseArticle;
        this.courseQA = builderEx.courseQA;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    public static class CourseBuilderEx{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseQA;
        private String courseArticle;
        public CourseBuilderEx buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilderEx buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilderEx buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilderEx buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilderEx buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public CourseEx makeCourse() {
            return new CourseEx(this);
        }
    }
}
