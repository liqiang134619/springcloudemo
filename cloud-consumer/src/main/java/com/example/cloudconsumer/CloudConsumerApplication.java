package com.example.cloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * springcloudApplication
 * 	开启三个注解：
 * @SpringBootApplication
 * @EnableDiscoveryClient
 * @EnableCircuitBreaker
 * cloud消费 负载均衡
 * @author Liq
 */
@SpringCloudApplication
public class CloudConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerApplication.class, args);
	}

	/**
	 * 使用springmvc的restTemplate 并加入注解loadbalanced开启负载均衡
	 * @return RestTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return  new RestTemplate();
	}

}
