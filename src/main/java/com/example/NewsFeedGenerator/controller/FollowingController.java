package com.example.NewsFeedGenerator.controller;

import com.example.NewsFeedGenerator.service.UserFollowService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/follow_user")
public class FollowingController {
    @PostMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object followUser(@RequestBody Map<String,String> payload) {
        String followee_username = null,follower_username = null;
        for(Map.Entry<String,String> map:payload.entrySet()) {
            if (map.getKey().equals("followee")) {
                followee_username=map.getValue();
//
            }
            if (map.getKey().equals("follower")) {
                follower_username=map.getValue();
//
            }
        }
        if(followee_username==null)
            return "no such user: "+followee_username;
        if(follower_username==null)
            return "no such user: "+follower_username;

        UserFollowService.followUser(followee_username,follower_username);
        Map<String,String> mp=new HashMap<>();
        mp.put("following","done");
        return mp;

    }
}
