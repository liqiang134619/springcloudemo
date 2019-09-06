package com.example.cloudserver2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Liq
 * @date 2019/9/5
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@ComponentScan(basePackages = {"com.example.common"})
@ComponentScan(basePackages = {"com.example.cloudserver2"})
@EnableConfigurationProperties
@Slf4j
public class CloudServer2Application implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(CloudServer2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("【==> cloudServer2 启动】");
    }
}
