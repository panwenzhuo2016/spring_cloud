package com.course.pay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @GetMapping("users/{id}")
    public String getUser(@PathVariable("id") String id) {
        System.out.println("接收到请求[/users/" + id + "]");
        return "testUser";
    }

}