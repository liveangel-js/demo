package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liveangel on 2016-10-16.
 */
@Controller
public class UserProfileController {

    @RequestMapping("/profile")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="No Name") String name, Model model) {
        model.addAttribute("name", name);
        return "profile";
    }
}
