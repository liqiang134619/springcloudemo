package com.example.cloudserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liq
 * @date 2019/8/18
 */
@RestController
@RequestMapping()
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "hello spring cloud";
    }
}
