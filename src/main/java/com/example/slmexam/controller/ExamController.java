package com.example.slmexam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {

    private String test = "hello world";

    public String getStatus() {
        return test;
    }
    public void setStatus(String test) {
        this.test = test;
    }

    @RequestMapping("/test")
    public String showTest(){
        return getStatus();
    }
}
