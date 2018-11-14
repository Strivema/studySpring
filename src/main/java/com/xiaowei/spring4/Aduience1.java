package com.xiaowei.spring4;

import org.aspectj.lang.annotation.*;

/**
 * @athour Marie
 * @date 2018/11/14 5:36 PM
 **/
@Aspect
public class Aduience1 {
    @Pointcut("execution(* perform(..))")
    public void perform(){}
    @Before("perform()")
    public void test1(){
        System.out.println("test1");
    }
    @Before("perform()")
    public void test2(){
        System.out.println("test2");
    }
    @AfterReturning("perform()")
    public void test3(){
        System.out.println("test3");
    }
    @AfterThrowing("perform()")
    public void test4(){
        System.out.println("test4");
    }


}
