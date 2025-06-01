package com.zeun.jdbc.model;

import java.sql.Date;

public class EnrollmentDTO {

    private int enrollId;
    private int studentId;
    private int courseId;
    private java.sql.Date enrollDate;

    public EnrollmentDTO() {}

    public EnrollmentDTO(int enrollId, int studentId, int courseId, Date enrollDate) {
        this.enrollId = enrollId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "EnrollmentDTO{" +
                "enrollId=" + enrollId +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", enrollDate=" + enrollDate +
                '}';
    }

    public int getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(int enrollId) {
        this.enrollId = enrollId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }
}
