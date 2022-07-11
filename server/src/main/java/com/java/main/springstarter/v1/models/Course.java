package com.java.main.springstarter.v1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.java.main.springstarter.v1.audits.InitiatorAudit;
import com.java.main.springstarter.v1.dtos.CreateOrUpdateCourseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course extends InitiatorAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "teaching_hours", unique = true)
    private String teachingHours;

    @Column(name = "class_level")
    private Integer classLevel;

    @ManyToMany
    @JoinTable(name = "course_students", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students = new ArrayList<>();

    public Course(CreateOrUpdateCourseDTO courseDTO) {
        this.name = courseDTO.getName();
        this.teachingHours = courseDTO.getTeachingHours();
        this.classLevel = courseDTO.getClassLevel();
    }
}
