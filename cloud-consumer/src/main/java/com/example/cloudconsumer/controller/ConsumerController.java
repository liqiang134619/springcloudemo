package com.example.cloudconsumer.controller;

import com.example.cloudconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liq
 * @date 2019/8/18
 */

@RestController
@RequestMapping
public class ConsumerController {


    @Autowired
    ConsumerService consumerService;

    @GetMapping("/getHello")
    public String getHello() {
        return consumerService.helloConsumer();
    }

}
