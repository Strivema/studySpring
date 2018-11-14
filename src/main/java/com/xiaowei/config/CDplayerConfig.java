package com.xiaowei.config;

import com.xiaowei.test.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @athour Marie
 * @date 2018/11/1 8:46 PM
 **/
@Configuration
public class CDplayerConfig {
    @Bean
     public CDPlayer cdPlayer(){return new CDPlayer();}

}
