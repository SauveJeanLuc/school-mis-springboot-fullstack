package com.example.clientui.api;

import com.example.clientui.output.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.java.main.springstarter.v1.dtos.SignInDTO;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping
public class Default {


    @GetMapping
    String welcome(@ModelAttribute("signIn") SignInDTO signIn){
        return "login";
    }

}
