package com.blog.blogapp.service;

import com.blog.blogapp.entity.User;
import com.blog.blogapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUser(String userid){
        return userRepository.findById(userid).orElse(null);
    }

    public List<User> allUser(){
        return userRepository.findAll();
    }
}
