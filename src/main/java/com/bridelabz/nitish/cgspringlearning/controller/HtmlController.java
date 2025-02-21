package com.bridelabz.nitish.cgspringlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class HtmlController {

    @GetMapping("health-check")
    public String healthCheck() {
        return "Ok";
    }
    @GetMapping("helloHtml")
    public String helloHtml(Model model) {
        return "hello";
    }

}
