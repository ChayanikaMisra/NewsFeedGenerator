package com.example.NewsFeedGenerator.controller;

import com.example.NewsFeedGenerator.model.User;
import com.example.NewsFeedGenerator.service.UserCreateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/create")
    public User addUser(@RequestBody String username) {

        return UserCreateService.createUser(username);

    }

    @PostMapping("/update")
    public User updateUser(@RequestBody User user) {
        return UserCreateService.updateUser(user);

    }

    @DeleteMapping("/delete")
    public User deleteUser(@RequestBody String username) {

        return UserCreateService.deactivateUser(username);

    }

}
