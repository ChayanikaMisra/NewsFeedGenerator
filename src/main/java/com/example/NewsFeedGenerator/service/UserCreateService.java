package com.example.NewsFeedGenerator.service;

import com.example.NewsFeedGenerator.repository.JavaCouchDB;
import com.example.NewsFeedGenerator.model.User;

import java.util.List;

public class UserCreateService {
    public static User createUser(String username){
        User u=new User();
        u.setUsername(username);
        JavaCouchDB.saveUser(u);
        return u;
    }
    public static User getUser(String username){
        try {
            return JavaCouchDB.getUser(username);
        }
        catch(org.ektorp.DocumentNotFoundException e){
            return null;
        }
    }

    public static User updateUser(User user){
        User u=user;
        JavaCouchDB.updateUser(u);
        return u;
    }
    public static User deactivateUser(String username){
        User u=JavaCouchDB.getUser(username);
        JavaCouchDB.deleteUser(u);
        return u;
    }
}
