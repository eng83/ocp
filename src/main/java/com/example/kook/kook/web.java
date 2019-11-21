package com.example.kook.kook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class web {
    @GetMapping(path = "/{name}")
    public String hello(@PathVariable String name){
        System.out.println("v3 input name :" + name);
        return "hello WoW Good" + name;
    }

}
