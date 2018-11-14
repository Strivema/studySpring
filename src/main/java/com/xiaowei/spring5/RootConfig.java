package com.xiaowei.spring5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @athour Marie
 * @date 2018/11/14 8:30 PM
 **/
@Configuration
@ComponentScan(basePackages = {"com.xiaowei"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
})

public class RootConfig {

}
