package com.hao.teamjob.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
