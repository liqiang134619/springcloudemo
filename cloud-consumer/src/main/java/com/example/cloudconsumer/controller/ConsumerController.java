package com.example.cloudconsumer.controller;

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
    private RestTemplate restTemplate;


    @GetMapping("/getHello")
    public String helloConsumer() {
        ResponseEntity<String> entity = restTemplate
            .getForEntity("http://cloud-server/hello", String.class);
        return entity.getBody();
    }


}
