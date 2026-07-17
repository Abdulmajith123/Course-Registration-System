package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryrepo;
import com.example.Course.Registration.System.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
@Autowired
Courserepo repo;

@Autowired
CourseRegistryrepo regrepo;
    public List<Course> availablecourse() {
    return repo.findAll();
    }

    public List<CourseRegistry> enrolledstudents() {
        return regrepo.findAll();
    }

    public void enroledcourse(String name, String emailid, String courseName) {
        CourseRegistry registry=new CourseRegistry(name,emailid,courseName);
         regrepo.save(registry);
    }
}
