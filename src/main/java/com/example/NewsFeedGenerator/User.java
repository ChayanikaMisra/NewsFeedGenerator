package com.example.NewsFeedGenerator;

import com.example.NewsFeedGenerator.models.UserFeedAndProfile;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {


    private String username;
    private String revision;
    private UserFeedAndProfile userFeedProfile;


    public UserFeedAndProfile getUserFeedProfile() {
        return userFeedProfile;
    }

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
