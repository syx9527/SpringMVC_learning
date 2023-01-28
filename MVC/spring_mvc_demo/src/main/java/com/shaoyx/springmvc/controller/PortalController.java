package com.shaoyx.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date:2023/1/28
 *
 * @author SYX
 */

@Controller
public class PortalController {

    @RequestMapping("/")
    public String portal() {
        return "index";
    }
}
