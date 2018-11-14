package com.xiaowei.assembly;

import org.springframework.stereotype.Component;

/**
 * @athour Marie
 * @date 2018/11/3 11:05 AM
 **/
@Component
public class Cake implements Dessert{

    public void type() {
        System.out.println("cake");

    }

    public void price() {
        System.out.println("1000");
    }
}
