package com.example.NewsFeedGenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class User {


    private String username;
    private String revision;
    private UserFeedAndProfile userFeedProfile;

    public User(){
        this.username = "";
        this.userFeedProfile = new UserFeedAndProfile(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

    }

//    public User(String username) {
//        this.username = username;
//        this.userFeedProfile = new UserFeedAndProfile(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
//    }

    @JsonProperty("userProfile")
    public UserFeedAndProfile getUserFeedProfile() {
        return userFeedProfile;
    }

    @JsonProperty("userProfile")
    public void setUserFeedProfile(UserFeedAndProfile userFeedProfile) {
        this.userFeedProfile = userFeedProfile;
    }

    @JsonProperty("_id")
    public String getUsername() {
        return username;
    }

    @JsonProperty("_id")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("_rev")
    public String getRevision() {
        return revision;
    }

    @JsonProperty("_rev")
    public void setRevision(String revision) {
        this.revision = revision;
    }
}
