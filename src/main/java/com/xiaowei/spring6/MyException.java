package com.xiaowei.spring6;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @athour Marie
 * @date 2018/11/21 8:50 PM
 **/
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "not found")
public class MyException extends RuntimeException {


}
