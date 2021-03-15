package com.course;

import com.fasterxml.jackson.datatype.jsr310.ser.ZoneIdSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaServer
public class Eureka {

    public static void main(String[] args) {
        SpringApplication.run(Eureka.class,args);
    }

}