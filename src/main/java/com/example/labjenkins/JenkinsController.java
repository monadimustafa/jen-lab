package com.example.labjenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping ("/build")
    public String getInfo(){
        return "jenkins lab mustapha bahbah ";
    }
}
