package com.shaoyx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2023/1/28
 *
 * @author SYX
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String portal() {
        // 将逻辑试图返回

        return "index";
    }
    @RequestMapping("/hello")
    public String hello() {
        // 将逻辑试图返回

        return "success";
    }

}
