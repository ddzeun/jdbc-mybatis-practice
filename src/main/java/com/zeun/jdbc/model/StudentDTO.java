package com.zeun.jdbc.model;

public class StudentDTO {

    private int studentId;
    private String name;
    private int age;
    private int major;

    public StudentDTO() {}

    public StudentDTO(int studentId, String name, int age, int major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major=" + major +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }
}
