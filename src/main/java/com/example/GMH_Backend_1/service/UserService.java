package com.example.GMH_Backend_1.service;

import com.example.GMH_Backend_1.model.User;
import com.example.GMH_Backend_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User getUser(){
        return userRepository.getUser();
    }
}
