package com.example.NewsFeedGenerator.services;

import com.example.NewsFeedGenerator.models.User;
import com.example.NewsFeedGenerator.models.Post;
import com.example.NewsFeedGenerator.models.UserFeedAndProfile;

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
