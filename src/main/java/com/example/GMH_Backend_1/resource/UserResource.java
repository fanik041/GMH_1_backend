package com.example.GMH_Backend_1.resource;

import com.example.GMH_Backend_1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserResource {
    
    @GetMapping("/user")
    public User getUser(){
        User obj = new User("fahim", "canada",  25);
        return obj;
    }
}
