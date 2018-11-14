package com.xiaowei.test;

/**
 * @athour Marie
 * @date 2018/11/2 2:11 PM
 **/
public class Person {
    public Person(String name,String age){
        this.age = age;
        this.name =name;
    }
    public Person() {
    }

    private Man man;
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }
}
