package com.example.uritemplate.controller;

import jakarta.annotation.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HomeController {
    //curl http://localhost:8080/person/John/city/Yangon/hobby/Football/age/23
    @GetMapping("/person/{name}/city/{city}/hobby/{hobby}/age/{age}")
    public String personInfoV1(
            @PathVariable("name")String name,
            @PathVariable String city,
            @PathVariable("hobby")String myhobby,
            @PathVariable int age
    ){
             return String.format(
                     "Name::[%s]\nCity::[%s]\nHobby::[%s]\nAge::[%d]",name,city,myhobby,age
             );
    }
    //curl http://localhost:8080/personinfo/Myaing/Reading
    @GetMapping({"/personinfo/{name}/{hobby}","/personinfo/{name}"})
    public String presonInfoV2(
            @PathVariable String name,
            @PathVariable Optional<String> hobby
    ){
        return String.format(
                "Name::%s\nHobby::%s",name,hobby.orElse("Reading")
        );
    }
}

