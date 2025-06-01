package com.santoshkumawat.DaoApp.controller;

import com.santoshkumawat.DaoApp.entity.User;
import com.santoshkumawat.DaoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    private User getUserById(@PathVariable("id") Long id){
        Optional<User> userById = userService.getUserById(id);
        return userById.get();
    }

}
