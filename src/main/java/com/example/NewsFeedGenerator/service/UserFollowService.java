package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.model.User;
import com.example.NewsFeedGenerator.repository.JavaCouchDB;

import java.util.List;

public class UserFollowService {
    public static void followUser(String followee_username, String follower_username) {
        addToUsersFollowers(followee_username,follower_username);
        addToUsersFollowings(followee_username,follower_username);
    }
    public static void addToUsersFollowers(String followee_username, String follower_username){
        User followee= JavaCouchDB.getUser(followee_username);
        List<String> followers = followee.getUserFeedProfile().getFollowers();
        followers.add(follower_username);
        followee.getUserFeedProfile().setFollowers(followers);
        UserCreateService.updateUser(followee);
    }
    public static void addToUsersFollowings(String followee_username, String follower_username){
        User follower= JavaCouchDB.getUser(follower_username);
        List<String> followings = follower.getUserFeedProfile().getFollowing();
        followings.add(followee_username);
        follower.getUserFeedProfile().setFollowing(followings);
        UserCreateService.updateUser(follower);
    }



}
