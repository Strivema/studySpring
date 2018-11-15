package com.xiaowei.spring5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @athour Marie
 * @date 2018/11/14 8:41 PM
 **/
@Controller
public class HomeController {
    @RequestMapping(value = "/",method = GET)
    public String home(){
        return "home";
    }

}
