package com.example.consumer2;

import com.example.common.feign.FeignClientInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author Liq
 * @date 2019/8/20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Consumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer2Application.class, args);
    }



    @Bean
    public FeignClientInterceptor feignClientInterceptor(){ return new FeignClientInterceptor(); }

}
