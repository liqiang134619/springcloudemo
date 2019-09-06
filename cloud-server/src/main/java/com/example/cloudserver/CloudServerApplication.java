package com.example.cloudserver;

import com.example.cloudserver.confis.HotelProperties;
import java.util.HashSet;
import javax.xml.bind.SchemaOutputResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
@ComponentScan(basePackages = {"com.example.common"})
@ComponentScan(basePackages = {"com.example.cloudserver"})
@EnableConfigurationProperties
@Slf4j
public class CloudServerApplication implements CommandLineRunner {


	@Autowired
	HotelProperties hotelProperties;

	public static void main(String[] args) {
		SpringApplication.run(CloudServerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		HashSet<String> ids = hotelProperties.getIds();
		log.info("【==> qidong:{}】",ids.size());
	}
}
