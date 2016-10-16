package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liveangel on 2016-10-16.
 */
@RestController
public class IndexController {
    @RequestMapping("/i")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
