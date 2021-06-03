package com.example.NewsFeedGenerator;

import com.example.NewsFeedGenerator.models.User;
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

    public JavaCouchDB createDbConnection()
    {
        //--------------- Creating Connection--------------------------//
        JavaCouchDB jd = new JavaCouchDB();
        jd.db.createDatabaseIfNotExists();
        //--------------- Creating Document----------------------------//
        return jd;
    }

    public static void saveUser(User u)
    {
        JavaCouchDB jd = new JavaCouchDB();
        jd.db.create(u);
    }

    public static void updateUser(User u)
    {
        JavaCouchDB jd = new JavaCouchDB();
        jd.db.update(u);
    }

    public static void deleteUser(User u)
    {
        JavaCouchDB jd = new JavaCouchDB();
        jd.db.delete(u);
    }

    public static void main(String[] args) throws MalformedURLException {
//        //--------------- Creating Connection--------------------------//
//        JavaCouchDB jd = new JavaCouchDB();
//        jd.db.createDatabaseIfNotExists();
//        //--------------- Creating Document----------------------------//



    }
}