package com.example.consumer2.controller;

import com.example.consumer2.Entity.User;
import com.example.consumer2.feign.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liq
 * @date 2019/8/22
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloClient helloClient;

    @GetMapping("/hello")
    public String hello() {
        return helloClient.hello();
    }

    @GetMapping("/hello2")
    public String hello2() {
        String hello = helloClient.hello();
        String s = helloClient.hello1("xx");
        String s1 = helloClient.hello3(new User("ss", "xxx"));
        User user = helloClient.hello2("dd", "mm");
        return hello + " | " + s + " | " + s1 + " | " + user;
    }

}
