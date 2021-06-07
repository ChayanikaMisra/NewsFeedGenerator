package com.example.NewsFeedGenerator.controller;

import com.example.NewsFeedGenerator.model.User;
import com.example.NewsFeedGenerator.repository.JavaCouchDB;
import com.example.NewsFeedGenerator.service.UserCreateService;
import com.example.NewsFeedGenerator.service.UserFollowService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/follow_user")
public class FollowingController {
    @PostMapping("/")
    public String followUser(@RequestBody Map<String,String> payload) {
        User followee=null,follower=null;
        String followee_username = null,follower_username = null;
        for(Map.Entry<String,String> map:payload.entrySet()) {
            if (map.getKey().equals("followee")) {
                followee_username=map.getValue();
                followee = UserCreateService.getUser(followee_username);
            }
            if (map.getKey().equals("follower")) {
                follower_username=map.getValue();
                follower = UserCreateService.getUser(follower_username);
            }
        }
        if(followee==null)
            return "no such user: "+followee_username;
        if(follower==null)
            return "no such user: "+follower_username;

        UserFollowService.followUser(followee,follower);
        return "";

    }
}
