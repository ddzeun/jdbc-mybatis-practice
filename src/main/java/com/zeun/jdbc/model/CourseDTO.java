package com.zeun.jdbc.model;

public class CourseDTO {

    private int courseId;
    private String title;
    private String instructor;
    private int credit;

    public CourseDTO() {}

    public CourseDTO(int courseId, String title, String instructor, int credit) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", instructor='" + instructor + '\'' +
                ", credit=" + credit +
                '}';
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
