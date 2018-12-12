package com.makijob.usermanager.controller;

import com.makijob.usermanager.model.User;
import com.makijob.usermanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    // add user
    @PostMapping("/api/v1/user/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    // del user
    @DeleteMapping("/api/v1/user/delete")
    public void deleteUser(@RequestBody User user){
         userRepository.delete(user);
    }

    


    

}
