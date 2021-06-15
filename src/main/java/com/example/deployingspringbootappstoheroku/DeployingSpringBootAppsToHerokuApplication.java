package com.example.deployingspringbootappstoheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DeployingSpringBootAppsToHerokuApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! Wiliam here";
    }

    public static void main(String[] args) {
        SpringApplication.run(DeployingSpringBootAppsToHerokuApplication.class, args);
    }
}