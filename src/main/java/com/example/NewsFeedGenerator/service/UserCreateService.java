package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.repository.JavaCouchDB;
import com.example.NewsFeedGenerator.model.User;

public class UserCreateService {
    public static User createUser(String username){
        User u=new User();
        u.setUsername(username);
        JavaCouchDB.saveUser(u);
        return u;
    }
    public static User updateUser(String username){
        User u=JavaCouchDB.getUser(username);
        System.out.println(u);
        JavaCouchDB.updateUser(u);
        return u;
    }
    public static User deactivateUser(String username){
        User u=JavaCouchDB.getUser(username);
        JavaCouchDB.deleteUser(u);
        return u;
    }
}
