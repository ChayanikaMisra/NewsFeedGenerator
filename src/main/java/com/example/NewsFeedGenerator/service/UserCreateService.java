package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.repository.JavaCouchDB;
import com.example.NewsFeedGenerator.model.User;

public class UserCreateService {
    public static void createUser(String username){
        User u=new User(username);
        JavaCouchDB.saveUser(u);
    }
    public static void updateUser(String username){
        User u=new User(username);
        JavaCouchDB.updateUser(u);
    }
    public static void deactivateUser(String username){
        User u=new User(username);
        JavaCouchDB.deleteUser(u);
    }
}
