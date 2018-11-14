package com.xiaowei.test;

/**
 * @athour Marie
 * @date 2018/11/2 2:35 PM
 **/
public class Man {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}
