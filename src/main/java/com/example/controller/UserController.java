package com.example.controller;

/**
 * Created by liveangel on 2016-10-16.
 */
import java.util.concurrent.atomic.AtomicLong;

import com.example.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user")
    public User greeting(@RequestParam(value="name", defaultValue="No Name") String userName) {
//        http://localhost:8080/user?name=Jack
        return new User(counter.incrementAndGet(),
                String.format(template, userName));
    }
}