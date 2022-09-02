package com.example.databasetest001.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/con")
public class firstcontroller {

    @GetMapping("/hello")
    @ResponseBody
    public String first(){
        return "hello from the first. Wrelcome to the weorld,.";
    }
}
