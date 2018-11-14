package com.xiaowei.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.net.ssl.StandardConstants;

/**
 * @athour Marie
 * @date 2018/11/1 8:32 PM
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayer.class)
public class MainTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Bean
    @Primary
    public MedeaPlayer medeaPlayer(){
        return new MedeaPlayer();
    }
    @Test
    public void person(){
        System.out.println(new Person());
    }

}
