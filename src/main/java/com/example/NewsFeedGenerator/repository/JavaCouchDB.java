package com.example.NewsFeedGenerator.repository;

import com.example.NewsFeedGenerator.model.User;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.MalformedURLException;

public class JavaCouchDB {
    HttpClient httpClient = new StdHttpClient.Builder().host("localhost")
            .port(5984)
            .username("admin")
            .password("adminroot")
            .build();
    CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
    //--------------- Creating database----------------------------//
    CouchDbConnector db = new StdCouchDbConnector("news-feed-service", dbInstance);

    public static JavaCouchDB createDbConnection()
    {
        //--------------- Creating Connection--------------------------//
        JavaCouchDB jd = new JavaCouchDB();
        jd.db.createDatabaseIfNotExists();
        //--------------- Creating Document----------------------------//
        return jd;
    }
    public static User getUser(String id)
    {
        JavaCouchDB jd = createDbConnection();
        return jd.db.get(User.class, id);
    }

    public static void saveUser(User u)
    {
        JavaCouchDB jd = createDbConnection();
        jd.db.create(u);
    }

    public static void updateUser(User u)
    {
        JavaCouchDB jd = createDbConnection();
        jd.db.update(u);
    }

    public static void deleteUser(User u)
    {
        JavaCouchDB jd = createDbConnection();
        jd.db.delete(u);
    }

    public static void main(String[] args) throws MalformedURLException {
//        //--------------- Creating Connection--------------------------//
//        JavaCouchDB jd = new JavaCouchDB();
//        jd.db.createDatabaseIfNotExists();
//        //--------------- Creating Document----------------------------//



    }
}