package com.blog.blogapp.controller;

import com.blog.blogapp.entity.User;
import com.blog.blogapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private  final UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/find/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
       return userService.allUser();
    }
}
