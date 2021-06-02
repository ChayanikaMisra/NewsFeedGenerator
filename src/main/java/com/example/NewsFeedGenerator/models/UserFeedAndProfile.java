package com.example.NewsFeedGenerator.models;

import java.util.List;

public class UserFeedAndProfile {
    private List<Post> profilePosts;
    private List<Post> newsFeedPosts;
    private List<User> followers;
    private List<User> following;

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return following;
    }

    public void setFollowing(List<User> following) {
        this.following = following;
    }

    public List<Post> getProfilePosts() {
        return profilePosts;
    }

    public void setProfilePosts(List<Post> profilePosts) {
        this.profilePosts = profilePosts;
    }

    public List<Post> getNewsFeedPosts() {
        return newsFeedPosts;
    }

    public void setNewsFeedPosts(List<Post> newsFeedPosts) {
        this.newsFeedPosts = newsFeedPosts;
    }
}
