package com.example.cloudserver2.controller;

import com.example.common.model.request.server2.TestRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Liq
 * @date 2019/9/5
 */
@RestController
@RequestMapping("/server2")
public class BaseController {


    @GetMapping("/con1")
    public String con1() {
        return "yeah server2-con1";
    }

    @GetMapping("/con2")
    public ModelAndView con2() {
        return new ModelAndView("redirect:" + "http://www.baidu.com");
    }

    @PostMapping("/con3")
    public String con3(@RequestBody TestRequest request) {
        return request.toString();
    }

    /**
     * get 请求不支持
     * @param request
     * @return
     */
    @GetMapping("/con4")
    public String con4(@RequestBody TestRequest request) {
        return request.toString();
    }

    @GetMapping("/con5")
    public String con5(@RequestParam("test") String test){
        return test;
    }

    @GetMapping("/con6")
    public String con6(String test){
        return test;
    }


    @GetMapping("/con7")
    public String con7(TestRequest request){
        return request.toString();
    }

}
