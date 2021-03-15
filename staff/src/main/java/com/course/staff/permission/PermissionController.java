package com.course.staff.permission;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermissionController {

    @GetMapping("users/{id}")
    public String getUser(@PathVariable("id") String id) {
        System.out.println("接收到请求[/users/" + id + "]");
        return "testUser";
    }

}