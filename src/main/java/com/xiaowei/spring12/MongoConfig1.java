package com.xiaowei.spring12;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @athour Marie
 * @date 2018/11/30 5:51 PM
 **/
@Configuration
@EnableMongoRepositories
public class MongoConfig1 extends AbstractMongoConfiguration {
    @Autowired
    Environment environment;

    public MongoClient mongoClient() {
        return new MongoClient();
    }

    protected String getDatabaseName() {
        return null;
    }
    public Mongo mongo(){
        MongoCredential credential = MongoCredential.createCredential(environment.getProperty("monggo.username"),"",new char[2]);
        return new MongoClient(new ServerAddress("localhost"), Arrays.asList(credential));
    }
}
