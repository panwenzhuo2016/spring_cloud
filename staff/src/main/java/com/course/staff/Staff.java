package com.course.staff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// 注意：服务端配置的是EnableEurekaServer，客户端配置的是EnableEurekaClient
@EnableEurekaClient
public class Staff {

    public static void main(String[] args) {
        SpringApplication.run(Staff.class, args);
    }

}