package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.demo.controller.TestController;

@SpringBootApplication
public class ActivitiApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(ActivitiApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(TestController.class);
        return builder;
    }
}
