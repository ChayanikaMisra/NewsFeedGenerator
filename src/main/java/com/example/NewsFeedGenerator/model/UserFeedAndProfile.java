package com.example.NewsFeedGenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class UserFeedAndProfile {
    private List<Post> profilePosts;
    private List<Post> newsFeedPosts;
    private List<String> followers;
    private List<String> following;

    public UserFeedAndProfile(){
        this.profilePosts = new ArrayList<>();
        this.newsFeedPosts = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
    }

    public UserFeedAndProfile(List<Post> profilePosts, List<Post> newsFeedPosts, List<String> followers, List<String> following) {
        this.profilePosts = profilePosts;
        this.newsFeedPosts = newsFeedPosts;
        this.followers = followers;
        this.following = following;
    }

    @JsonProperty("followers")
    public List<String> getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(List<String> followers) {
        this.followers = followers;
    }

    @JsonProperty("following")
    public List<String> getFollowing() {
        return following;
    }

    @JsonProperty("following")
    public void setFollowing(List<String> following) {
        this.following = following;
    }

    @JsonProperty("profilePosts")
    public List<Post> getProfilePosts() {
        return profilePosts;
    }

    @JsonProperty("profilePosts")
    public void setProfilePosts(List<Post> profilePosts) {
        this.profilePosts = profilePosts;
    }

    @JsonProperty("newsfeedPosts")
    public List<Post> getNewsFeedPosts() {
        return newsFeedPosts;
    }

    @JsonProperty("newsfeedPosts")
    public void setNewsFeedPosts(List<Post> newsFeedPosts) {
        this.newsFeedPosts = newsFeedPosts;
    }
}
