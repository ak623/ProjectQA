package com.qa.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation wraps other annotations used by springboot
// not to view the defintion of the code it is F4 OR CTRL+SHIFT+I
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        // this code intialises the spring context and applies all the annotations
        SpringApplication.run(Start.class, args);
    }
}