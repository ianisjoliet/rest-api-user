package com.ianis.ianis.controller;

import com.ianis.ianis.repository.UserRepository;
import com.ianis.ianis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/users")
@RestController
public class User {

    private final UserService userService;

    @Autowired
    public User(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping
    public List<com.ianis.ianis.model.User> getAllUsers() {
        return userService.getAllUser();
    }
}
