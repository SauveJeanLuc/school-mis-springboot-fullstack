package com.java.main.springstarter.v1.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.java.main.springstarter.v1.enums.EClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student extends User{

    @Column(name = "classroom")
    @Enumerated(EnumType.STRING)
    private EClass classroom;

    @Column(name = "class_level")
    private Integer classLevel;

    @JsonIgnore
    @ManyToMany(mappedBy = "students", fetch = FetchType.LAZY)
    private List<Course> enrolledCourses = new ArrayList<>();
}
