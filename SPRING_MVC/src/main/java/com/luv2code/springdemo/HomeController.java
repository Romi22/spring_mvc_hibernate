package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    public HomeController() {
        System.out.println("init done");
    }

    @RequestMapping("/menu")
    public String showPage() {
        return "main-menu";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }

}
