package com.example.message.gateway.controller.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminManager {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
