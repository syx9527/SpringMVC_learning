package com.shaoyx.springmvc.controller;

import com.shaoyx.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Date:2023/1/28
 *
 * @author SYX
 */
@Controller
@RequestMapping(value = "/param/")
public class TestParamController {


    @RequestMapping(value = "/servlet-api")
    public String getParamByServletApi(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("{" + "username: " + username + ", " + "password: " + password + "}");
        return "hello";
    }

    @RequestMapping(value = "/param", method = {RequestMethod.GET})
    public String getParamByParam(
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "test", required = false, defaultValue = "哇哈哈") String test,
            @RequestHeader(value = "referer", required = false) String referer,
            @CookieValue(value = "JSESSIONID", required = false) String jsessionId
    ) {

        System.out.println("{ \n" +
                "username: " + username + ", \n" +
                "password: " + password + ", \n" +
                "test: " + test + ", \n" +
                "referer: " + referer + ", \n" +
                "jsessionId: " + jsessionId + ", \n" +
                "}"
        );
        return "hello";
    }

    @RequestMapping(value = "/pojo", method = {RequestMethod.GET, RequestMethod.POST})
    public String getParamByPojo(User user) {
        System.out.println(user);
        return "hello";
    }

}
