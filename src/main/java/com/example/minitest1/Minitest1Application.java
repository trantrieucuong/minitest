package com.example.minitest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class Minitest1Application {

    public static void main(String[] args) {

        SpringApplication.run(Minitest1Application.class, args);
    }

}
