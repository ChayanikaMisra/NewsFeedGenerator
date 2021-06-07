package com.example.NewsFeedGenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class UserFeedAndProfile {
    private List<Post> profilePosts;
    private List<Post> newsFeedPosts;
    private List<User> followers;
    private List<User> following;

    public UserFeedAndProfile(){
        this.profilePosts = new ArrayList<>();
        this.newsFeedPosts = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public UserFeedAndProfile(List<Post> profilePosts, List<Post> newsFeedPosts, List<User> followers, List<User> following) {
        this.profilePosts = profilePosts;
        this.newsFeedPosts = newsFeedPosts;
        this.followers = followers;
        this.following = following;
    }

    @JsonProperty("followers")
    public List<User> getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    @JsonProperty("following")
    public List<User> getFollowing() {
        return following;
    }

    @JsonProperty("following")
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
