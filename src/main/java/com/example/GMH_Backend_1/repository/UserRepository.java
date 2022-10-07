package com.example.GMH_Backend_1.repository;

import com.example.GMH_Backend_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User obj = new User("fahim", "canada",  25);
        return obj;
    }

}
