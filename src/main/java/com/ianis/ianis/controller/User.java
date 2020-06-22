package com.ianis.ianis.controller;

import com.ianis.ianis.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/users")
@RestController
public class User {

    @Autowired
    UserDao userDao;

    @GetMapping(path = "{userId}")
    public com.ianis.ianis.model.User getUserById(@PathVariable("userId") Integer userId)
    {
        return userDao.findById(userId);
    }
}
