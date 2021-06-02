package com.example.NewsFeedGenerator.services;

import com.example.NewsFeedGenerator.models.Post;
import com.example.NewsFeedGenerator.models.User;
import com.example.NewsFeedGenerator.models.UserFeedAndProfile;

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
