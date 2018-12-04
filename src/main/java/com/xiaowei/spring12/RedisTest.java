package com.xiaowei.spring12;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

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
    @Bean
    public void redisCF(){
        RedisConnectionFactory redisConnectionFactory =  new JedisConnectionFactory();
        RedisConnection conn = redisConnectionFactory.getConnection();
        conn.set("hello".getBytes(),"world".getBytes());

        byte[] bytes = conn.get("hello".getBytes());


    }
    @Bean
    public RedisTemplate<String,Item> redisTemplate(RedisConnectionFactory rf){
        RedisTemplate<String,Item> redis = new RedisTemplate<String, Item>();
        redis.setConnectionFactory(rf);
        redis.setKeySerializer(new StringRedisSerializer());
        redis.setValueSerializer(new Jackson2JsonRedisSerializer<Item>(Item.class));
        return redis;
    }
}

