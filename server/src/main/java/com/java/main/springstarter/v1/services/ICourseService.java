package com.java.main.springstarter.v1.services;

import com.java.main.springstarter.v1.dtos.CreateOrUpdateCourseDTO;
import com.java.main.springstarter.v1.models.Course;

import java.util.List;
import java.util.UUID;

public interface ICourseService {

    Course create(CreateOrUpdateCourseDTO courseDTO);

    Course findById(UUID id);

    boolean existsById(UUID id);

    List<Course> findAll();

    Course update(UUID id, CreateOrUpdateCourseDTO courseDTO);

    boolean delete(UUID id);

}
