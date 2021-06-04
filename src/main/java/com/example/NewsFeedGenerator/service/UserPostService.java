package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.model.Post;
import com.example.NewsFeedGenerator.model.User;
import com.example.NewsFeedGenerator.model.UserFeedAndProfile;

import java.util.List;

public class UserPostService {
    public void addPost(User user, Post post) {
        addPostToUserProfile(post, user);
        addPostToNewsFeedOfFollowers(post, user);

    }

    public void addPostToUserProfile(Post post, User user) {
        UserFeedAndProfile UserFeedProfile = user.getUserFeedProfile();
        List<Post> ownPosts = UserFeedProfile.getProfilePosts();
        ownPosts.add(post);
        UserFeedProfile.setProfilePosts(ownPosts);
    }

    public void addPostToNewsFeedOfFollowers(Post post, User user) {
        List<User> followers = user.getUserFeedProfile().getFollowers();
        for (User follower : followers) {
            UserFeedAndProfile UserFeedProfileFollower = follower.getUserFeedProfile();
            List<Post> newsFeedPosts = UserFeedProfileFollower.getNewsFeedPosts();
            newsFeedPosts.add(post);
            UserFeedProfileFollower.setNewsFeedPosts(newsFeedPosts);
        }
    }
}
