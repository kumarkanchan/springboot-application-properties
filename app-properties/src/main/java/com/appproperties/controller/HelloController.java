package com.appproperties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name.fullname}")
    private String name;

    //@GetMapping("/")
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String hello() {
        return "WELCOME TO " + name;
    }


}
