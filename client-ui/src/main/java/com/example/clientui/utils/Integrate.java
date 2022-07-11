package com.example.clientui.utils;

import com.example.clientui.output.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Integrate {

    RestTemplate restTemplate = new RestTemplate();
    String baseUrl = "http://localhost:4000/api/v1/";

//    ResponseEntity<ApiResponse> post(String route, Object dto, ){
//
//        return null;
//    }

}
