package com.example.NewsFeedGenerator.controller;

import com.example.NewsFeedGenerator.model.Post;
import com.example.NewsFeedGenerator.model.User;
import com.example.NewsFeedGenerator.repository.JavaCouchDB;
import com.example.NewsFeedGenerator.service.UserPostService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/post")
public class PostController {
    @PostMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public void post(@RequestBody Map<String,String> payload) {
        String userName="";
        String postText=null;
        for(Map.Entry<String, String> map:payload.entrySet()) {
            if (map.getKey().equals("user")) {
                userName=map.getValue();
            }
            if (map.getKey().equals("post")) {
                postText=map.getValue();
            }
        }
        Post post=new Post(postText);
        User user=JavaCouchDB.getUser(userName);
        UserPostService.addPost(user, post);
    }
    }

