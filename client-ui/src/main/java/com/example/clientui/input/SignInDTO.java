package com.java.main.springstarter.v1.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignInDTO {

    @NotBlank
    @Email
    private  String email;

    @NotBlank
    private  String password;
}

