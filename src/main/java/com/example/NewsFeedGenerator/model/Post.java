package com.example.NewsFeedGenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

public class Post {
    private String text;
    private URL postUrl;
    private String username;

    public Post(){
        this.text="";
        this.username="";
    }

    public Post(String text, String username) {
        this.text = text;
        this.username = username;
    }

    @JsonProperty("postText")
    public String getText() {
        return text;
    }

    @JsonProperty("postText")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("user")
    public String getUsername() {
        return username;
    }

    @JsonProperty("user")
    public void setUsername(String username) {
        this.username = username;
    }

    public URL getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(URL postUrl) {
        this.postUrl = postUrl;
    }
}
