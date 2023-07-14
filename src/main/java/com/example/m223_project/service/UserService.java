package com.example.m223_project.service;

import com.example.m223_project.User;
import com.example.m223_project.repository.UserRepository;

import java.util.List;


public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.saveAndFlush(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
