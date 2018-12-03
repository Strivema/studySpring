package com.xiaowei.spring10;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @athour Marie
 * @date 2018/11/29 8:37 PM
 **/
public class DataTest {
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("");
        druidDataSource.setUrl("");
        druidDataSource.setUsername("");
        druidDataSource.setPassword("");
        // ....

        return druidDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

}
