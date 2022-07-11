package com.java.main.springstarter.v1.repositories;

import com.java.main.springstarter.v1.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICourseRepository extends JpaRepository<Course, UUID> {

}
