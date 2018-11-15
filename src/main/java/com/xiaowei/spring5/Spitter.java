package com.xiaowei.spring5;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @athour Marie
 * @date 2018/11/15 8:09 PM
 **/
public class Spitter {

    @NotNull
    private long id;

    @NotNull
    @Size(min=5,max = 16)
    private String name;
    @NotNull
    private String password;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
