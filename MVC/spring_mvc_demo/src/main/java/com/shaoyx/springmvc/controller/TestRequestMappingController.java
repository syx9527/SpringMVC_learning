package com.shaoyx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Date:2023/1/28
 *
 * @author SYX
 */

@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {


    @RequestMapping(
            value = {"/hello", "/abc"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String hello() {
        return "hello";
    }

    @RequestMapping(
            value = {"/hello", "/test"},
            method = {RequestMethod.GET, RequestMethod.POST},
            // params = {"username=admin"},
            headers = {"referer"}
    )
    public String Test() {
        return "hello";
    }


    @RequestMapping("/testRest/{id}/{username}")
    public String testRest(
            @PathVariable("id") Integer id,
            @PathVariable("username") String username
    ) {
        System.out.println("id:" + id + ",username:" + username);
        return "hello";
    }


}
