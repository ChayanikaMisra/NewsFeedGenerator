package com.example.NewsFeedGenerator.model;

import java.net.URL;

public class Post {
    private String text;
    private URL postUrl;

    public Post(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public URL getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(URL postUrl) {
        this.postUrl = postUrl;
    }
}
