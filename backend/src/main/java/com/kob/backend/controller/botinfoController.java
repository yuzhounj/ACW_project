package com.kob.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk/")
public class botinfoController {
    @RequestMapping("/getbot")
    public String getbot(){
        return "hhh";
    }
}
