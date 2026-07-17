package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")

public class CourseController {
    @Autowired
    CourseService service;

    @GetMapping("courses")
    public List<Course> availablecourse() {
        return service.availablecourse();
    }

    @GetMapping("course/enrolled")
    public List<CourseRegistry> enrolledstudents() {
        return service.enrolledstudents();
    }

    @PostMapping("course/register")
    public String enroledcourse(@RequestParam("name") String name,
                                @RequestParam("emailid") String emailid,
                                @RequestParam("courseName") String courseName) {
        service.enroledcourse(name, emailid, courseName);
        return " CONGRAGULATION " + name + " you have enrolled succesfully in " + courseName;
    }

}
