package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liveangel on 2016-10-20.
 */
@Controller
public class LoginController {

    @RequestMapping("/slogin")
    public String index() {
        return "slogin";
    }
}
