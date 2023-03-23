package com.example.uritemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {
    //curl "http://localhost:8080/api/person?name=Pyae+sone&age=23"
    //curl "http://localhost:8080/api/person?age=23"
    @GetMapping("/person")
    public String personV1(
            @RequestParam(value = "name",required = false,defaultValue = "Bigboss")String name,
            @RequestParam("age")int age
    ){
        return String.format(
                "Name:%s\nAge:%d",name,age
        );
    }
}
