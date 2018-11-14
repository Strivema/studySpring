package com.xiaowei.assembly;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @athour Marie
 * @date 2018/11/14 2:56 PM
 **/
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Qualifier
public @interface Cold {

}
