package com.xiaowei.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

/**
 * @athour Marie
 * @date 2018/11/1 8:17 PM
 **/
@Profile("dev")
public class CDPlayer {
    @Autowired
    private MedeaPlayer medeaPlayer;
    public CDPlayer() {
    }
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CDPlayer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
