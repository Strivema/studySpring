package com.xiaowei.spring4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @athour Marie
 * @date 2018/11/14 5:56 PM
 **/
@Aspect
public class Aduience2 {
    // 环绕通知
    @Pointcut("execution(* perform(..))")
    public void perform(){

    }
    @Around("perform()")
    public void test(ProceedingJoinPoint jp ){
        try {
            System.out.println("test1");
            jp.proceed();
            System.out.println("test2");

        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
