package com.xiaowei.spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @athour Marie
 * @date 2018/11/14 5:44 PM
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Con {
    @Bean
    public Aduience1 aduience(){
        return new Aduience1();
    }

}
