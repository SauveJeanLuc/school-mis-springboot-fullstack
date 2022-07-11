package com.java.main.springstarter.v1.controllers;


import com.java.main.springstarter.v1.dtos.CreateOrUpdateCourseDTO;
import com.java.main.springstarter.v1.payload.ApiResponse;
import com.java.main.springstarter.v1.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    private final ICourseService courseService;

    @Autowired
    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAll(){
        return ResponseEntity.ok(
            ApiResponse.success(courseService.findAll())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getById(@PathVariable UUID id){
        return ResponseEntity.ok(
          ApiResponse.success(courseService.findById(id))
        );
    }

    @PostMapping
    public ResponseEntity<ApiResponse> create(@Valid @RequestBody CreateOrUpdateCourseDTO courseDTO){
        return ResponseEntity.ok(
                ApiResponse.success(courseService.create(courseDTO))
        );
    }

    @PutMapping
    public ResponseEntity<ApiResponse> update(@PathVariable UUID id, @Valid @RequestBody CreateOrUpdateCourseDTO courseDTO){
        return ResponseEntity.ok(
                ApiResponse.success(courseService.update(id,courseDTO))
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> delete(@PathVariable UUID id, @Valid @RequestBody CreateOrUpdateCourseDTO courseDTO){
        if (courseService.delete(id))
            return ResponseEntity.ok(ApiResponse.success("Deleted successfully."));
        return ResponseEntity.ok(ApiResponse.fail("Deletion failed."));
    }

}
