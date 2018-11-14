package com.xiaowei.assembly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @athour Marie
 * @date 2018/11/14 3:47 PM
 **/
@Configuration
@PropertySource("classpath:app.properties")
public class Expression {
    @Autowired
    Environment env;
    public BlankDisc disc(){
       return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }

    public static void main(String[] args) {
        new Expression().disc();
    }

}
