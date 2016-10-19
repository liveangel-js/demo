package com.example.controller;

import com.example.dao.CustomerRepository;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liveangel on 2016-10-17.
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    //http://127.0.0.1:8080/get-by-email?email=qiyadeng@gmail.com
    @RequestMapping("/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId;
        
        Customer customer = customerRepository.findByEmail(email);
        if (customer != null) {
            userId = String.valueOf(customer.getId());
            return "The user id is: " + userId;
        }
        return "user " + email + " is not exist.";
    }
}