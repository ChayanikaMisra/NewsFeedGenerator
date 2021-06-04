package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.model.User;

import java.util.List;

public class UserFollowService {
    public void followUser(User followee, User follower) {
        List<User> followers = followee.getUserFeedProfile().getFollowers();
        followers.add(follower);
        followee.getUserFeedProfile().setFollowers(followers);
        List<User> followings = follower.getUserFeedProfile().getFollowing();
        followings.add(followee);
        follower.getUserFeedProfile().setFollowing(followings);
    }


}
