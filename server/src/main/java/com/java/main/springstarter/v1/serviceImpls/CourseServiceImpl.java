package com.java.main.springstarter.v1.serviceImpls;

import com.java.main.springstarter.v1.dtos.CreateOrUpdateCourseDTO;
import com.java.main.springstarter.v1.exceptions.ResourceNotFoundException;
import com.java.main.springstarter.v1.models.Course;
import com.java.main.springstarter.v1.repositories.ICourseRepository;
import com.java.main.springstarter.v1.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements ICourseService {

    private final ICourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(ICourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course create(CreateOrUpdateCourseDTO schoolDTO) {
        Course course = new Course(schoolDTO);

        course = courseRepository.save(course);

        return course;
    }

    @Override
    public Course findById(UUID id) {
        return courseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Course", "id", id.toString()));
    }

    @Override
    public boolean existsById(UUID id) {
        return courseRepository.existsById(id);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public boolean delete(UUID id) {

        courseRepository.deleteById(id);

        return true;
    }

    @Override
    public Course update(UUID id, CreateOrUpdateCourseDTO courseDTO) {
        Course course = findById(id);

        course.setName(courseDTO.getName());
        course.setTeachingHours(courseDTO.getTeachingHours());



        return this.courseRepository.save(course);
    }
}
