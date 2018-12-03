package com.xiaowei.spring9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

/**
 * @athour Marie
 * @date 2018/11/28 9:00 PM
 **/
@Configuration
@EnableWebMvcSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("pass").roles("user").and().withUser("admin")
                .password("admin").roles("admin","user");

        auth.inMemoryAuthentication().withUser("").roles();
        auth.inMemoryAuthentication().withUser("").password("");
        auth.inMemoryAuthentication().withUser("").accountLocked(true);
        auth.jdbcAuthentication().dataSource(dataSource);
        auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("").authoritiesByUsernameQuery("").passwordEncoder(new StandardPasswordEncoder("53cr3t"));
        // LDAP
        auth.ldapAuthentication().userSearchFilter("(uid={0})").groupSearchFilter("member={0}");

        // 配置远程LDAP服务器
        auth.ldapAuthentication().userSearchBase("").userSearchFilter("").groupSearchFilter("").contextSource().url("");
        // 配置嵌入式LDAP服务器
        auth.ldapAuthentication().contextSource().root("").ldif("");


    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("").authenticated().anyRequest().permitAll();
        http.authorizeRequests().antMatchers("").denyAll();
        // 关闭跨站请求伪造
        http.csrf().disable();

    }


}
