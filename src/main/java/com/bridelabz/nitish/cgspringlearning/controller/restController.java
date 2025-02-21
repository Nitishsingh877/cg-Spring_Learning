package com.bridelabz.nitish.cgspringlearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @RequestMapping("/")
    public String home() {
        return "hello from BridgeLabz!!!";
    }
}

