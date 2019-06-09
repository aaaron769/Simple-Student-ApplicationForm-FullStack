package com.simple.studentregistrationfom.app.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stuId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_Hobby")
    private String studentHobby;
    // constructor


    public Student(String studentName, String studentHobby) {
        this.studentName = studentName;
        this.studentHobby = studentHobby;
    }

    public Student() {

    }
    // setters and getters

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }
    // toString

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", studentName='" + studentName + '\'' +
                ", studentHobby='" + studentHobby + '\'' +
                '}';
    }
}
