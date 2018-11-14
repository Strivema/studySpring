package com.xiaowei.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @athour Marie
 * @date 2018/11/1 8:30 PM
 **/
@Component
public class MedeaPlayer {

    public MedeaPlayer() {
    }
    private String voice;
    private String name;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MedeaPlayer{" +
                "voice='" + voice + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
