package com.xiaowei.spring12;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @athour Marie
 * @date 2018/12/3 8:42 PM
 **/
public class RedisTest {
    @Bean
    public RedisConnectionFactory redis() {
        JedisConnectionFactory jedis = new JedisConnectionFactory();
        jedis.setHostName("redis-server");
        jedis.setPort(7379);
        jedis.setPassword("123");
        return jedis;
    }


}
