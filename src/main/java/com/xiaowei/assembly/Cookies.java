package com.xiaowei.assembly;

import org.springframework.stereotype.Component;

/**
 * @athour Marie
 * @date 2018/11/3 11:06 AM
 **/
@Component
public class Cookies implements Dessert {


    public void type() {
        System.out.println("cookies");
    }

    public void price() {
        System.out.println("100");
    }
}
