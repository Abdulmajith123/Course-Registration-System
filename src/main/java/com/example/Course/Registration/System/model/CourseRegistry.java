package com.example.Course.Registration.System.model;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "coursename")
    private String courseName;
    private String emailid;
    private String name;

    public CourseRegistry() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CourseRegistry that = (CourseRegistry) o;
        return id == that.id && Objects.equals(courseName, that.courseName) && Objects.equals(emailid, that.emailid) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, emailid, name);
    }

    public CourseRegistry(String name, String emailid, String courseName) {

        this.courseName = courseName;
        this.emailid = emailid;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
