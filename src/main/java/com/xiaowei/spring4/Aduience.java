package com.xiaowei.spring4;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @athour Marie
 * @date 2018/11/14 5:20 PM
 **/
@Aspect
public class Aduience {
    @Before("execution(* Performance.perform(..))")
    public void test1(){
        System.out.println("test1");
    }
    @Before("execution(* Performance.perform(..))")
    public void test2(){
        System.out.println("test2");
    }
    @AfterReturning("execution(* Performance.perform(..))")
    public void test3(){
        System.out.println("test3");
    }
    @AfterThrowing("execution(* Performance.perform(..))")
    public void test4(){
        System.out.println("test4");
    }

}
