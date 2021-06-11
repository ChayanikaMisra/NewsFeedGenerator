package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.model.Post;
import com.example.NewsFeedGenerator.model.User;
import com.example.NewsFeedGenerator.model.UserFeedAndProfile;
import com.example.NewsFeedGenerator.repository.JavaCouchDB;

import java.util.List;

public class UserPostService {
    public static void addPost(User user, Post post) {
        addPostToUserProfile(post, user);
        addPostToNewsFeedOfFollowers(post, user);

    }

    public static void addPostToUserProfile(Post post, User user) {
        UserFeedAndProfile UserFeedProfile = user.getUserFeedProfile();
        List<Post> ownPosts = UserFeedProfile.getProfilePosts();
        ownPosts.add(post);
        UserFeedProfile.setProfilePosts(ownPosts);
    }

    public static void addPostToNewsFeedOfFollowers(Post post, User user) {
        List<String> followers = user.getUserFeedProfile().getFollowers();
        for (String follower_username : followers) {
            User follower= JavaCouchDB.getUser(follower_username);
            UserFeedAndProfile UserFeedProfileFollower = follower.getUserFeedProfile();
            List<Post> newsFeedPosts = UserFeedProfileFollower.getNewsFeedPosts();
            newsFeedPosts.add(post);
            UserFeedProfileFollower.setNewsFeedPosts(newsFeedPosts);
        }
    }
}
