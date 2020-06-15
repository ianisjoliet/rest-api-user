package com.ianis.ianis.service;
import com.ianis.ianis.model.User;
import com.ianis.ianis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser()
    {
        return userRepository.getAllUser();
    }
}