package com.java.main.springstarter.v1.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CreateOrUpdateCourseDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String teachingHours;

    @NotNull
    private Integer classLevel;

}
