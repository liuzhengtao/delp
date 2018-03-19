package com.taotao123.www.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 *     author : user
 *     e-mail : liuzt@yuminsoft.com
 *     time   : 2018/03/19
 *     version: 1.0
 * </pre>
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/index")
    public String index(){
          return "hello";
    }


}
