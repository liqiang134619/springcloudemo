package com.example.cloudserver.controller;

import com.example.cloudserver.Entity.User;
import com.example.common.service.CommonService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liq
 * @date 2019/8/18
 */
@RestController
@RequestMapping("")
public class HelloController {

    @Autowired
    CommonService commonService;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        String header = request.getHeader("token");

        return "hello spring cloud, " + header;
    }

    @GetMapping("/hello1")
    public String hello1(@RequestParam(required = false) String name) {
        return "hello" + name;
    }

    @GetMapping("/hello2")
    public User hello2(@RequestHeader String name,@RequestHeader String age) {
        return new User(name,age);
    }
    @PostMapping("/hello3")
    public String hello3(@RequestBody User user) {

        return "hello" + user.getName() + "," + user.getAge();
    }
    @GetMapping("/xx")
    public  String test() {
        return commonService.test();

    }

}
