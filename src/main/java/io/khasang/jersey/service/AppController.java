package io.khasang.jersey.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("hello", "Index page!");
        return "index";
    }
}
