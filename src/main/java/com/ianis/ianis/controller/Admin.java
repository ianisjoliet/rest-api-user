package com.ianis.ianis.controller;

import com.ianis.ianis.model.User;
import com.ianis.ianis.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/admin")
@RestController
public class Admin {

    UserDao userDao;

    @Autowired
    public Admin (UserDao userDao)
    {
        this.userDao = userDao;
    }

    @GetMapping(path = "/users")
    public List<com.ianis.ianis.model.User> getAllUsers() {
        return userDao.findAll();
    }

    @GetMapping(path = "/users/{userId}")
    public com.ianis.ianis.model.User getUserById(@PathVariable("userId") Integer userId) {
        return userDao.findById(userId);
    }

    @PostMapping(path = "/users")
    public User createUser(@RequestBody User user) {
        return userDao.save(user);
    }

    @DeleteMapping(path = "/users/{userId}")
    public String deleteUser(@PathVariable("userId") int userId) {
        userDao.deleteById(userId);
        return "user with id"  + userId + " has been deleted";
    }

    @PutMapping(path = "/users/{userId}")
    public User updateUser(@PathVariable("userId") Integer userId, @RequestBody User user) {
        User newUser = userDao.findById(userId);
        newUser.setLogin(user.getLogin());
        newUser.setFirstname(user.getFirstname());
        newUser.setLastname(user.getLastname());
        newUser.setEmail(user.getEmail());
        newUser.setPhoneNb(user.getPhoneNb());

        return userDao.save(newUser);
    }
}