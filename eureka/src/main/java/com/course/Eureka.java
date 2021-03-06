package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaServer
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }

}