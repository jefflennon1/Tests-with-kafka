package com.noriservices.estoqueservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class homeController {

    @GetMapping("hello")
    public String heeloo(){
        return  "Hello word!";
    }
}
