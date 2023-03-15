package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@RestController

@EnableWebMvc
public class JavaSpringDemoApplication {

    @GetMapping("/message")
    public String message() {
        return "Hello.. I am deployed.. !";
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringDemoApplication.class, args);
    }

}
