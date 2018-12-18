package com.makijob.usermanager.controller;

import com.makijob.usermanager.model.User;
import com.makijob.usermanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    // add user
    @PostMapping("/api/v1/user/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    // delete user
    @DeleteMapping("/api/v1/user/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
         return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
    }

    // update user
    @PutMapping("/api/v1/user/update")
    public void updateUser(@RequestBody User user){
        userRepository.save(user);
    }

    @GetMapping("/api/v1/user/more/{id}")
    public Optional<User> moreInfo(@PathVariable Long id){
        return userRepository.findById(id);
    }


   








    

}
