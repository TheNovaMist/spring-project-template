package com.ysama.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v2/api")
public class HelloController {

        @RequestMapping("/hello")
    public String getName(Model model) {

        model.addAttribute("msg", "Ysama :)");

        return "hello"; // route to /WEB-INF/jsp/hello.jsp
    }
}
