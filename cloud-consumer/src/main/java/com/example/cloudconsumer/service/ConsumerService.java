package com.example.cloudconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liq
 * @date 2019/8/19
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "consumerFallback")
    public String helloConsumer() {
        ResponseEntity<String> entity = restTemplate
            .getForEntity("http://cloud-server/hello", String.class);
        return entity.getBody();
    }

    private String consumerFallback() {
        return "error";
    }

}
