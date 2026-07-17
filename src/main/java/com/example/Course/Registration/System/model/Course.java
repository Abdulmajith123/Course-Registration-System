package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Course {
    @Id
private String courseId;
private String courseName;
private String Trainee;
private int durationinWeek;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainee() {
        return Trainee;
    }

    public void setTrainee(String trainee) {
        Trainee = trainee;
    }

    public int getDurationinWeek() {
        return durationinWeek;
    }

    public void setDurationinWeek(int durationinWeek) {
        this.durationinWeek = durationinWeek;
    }
}
