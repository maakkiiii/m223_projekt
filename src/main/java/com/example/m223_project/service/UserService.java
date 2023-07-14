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

    public User loginUser(String email, String password){
        return userRepository.findEmailAndPassword(email, password);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User getUserById(User user){
        return userRepository.saveAndFlush(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }


}
