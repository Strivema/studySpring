package com.xiaowei.spring12;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @athour Marie
 * @date 2018/11/30 5:33 PM
 **/
@Configuration
@EnableMongoRepositories
public class MongoConfig {
    @Bean
    public MongoClientFactoryBean mongo(){
        MongoClientFactoryBean mongoClientFactoryBean = new MongoClientFactoryBean();

        mongoClientFactoryBean.
                setHost("localhost");
        return mongoClientFactoryBean;

    }
    @Bean
    public MongoOperations mongoTemplate(MongoClient mongo){
        return new MongoTemplate(mongo,"");
    }


}
