package com.example.consumer2.feign;

import com.example.consumer2.Entity.User;
import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Liq
 * @date 2019/8/22
 */
@FeignClient("cloud-server")
public interface HelloClient {

    /**
     * feign
     * @return x
     */
    @GetMapping("/hello")
    String hello();

    /**
     * get请求
     * @param name 注解中参数不能少
     * @return x
     */
    @GetMapping("/hello1")
    String hello1(@RequestParam("name") String name);

    /**
     *  注解中参数不能少,返回对象必须提供无参构造函数
     * @param name x
     * @param age x
     * @return x
     */
    @GetMapping("/hello2")
    User hello2(@RequestHeader("name") String name,@RequestHeader("age") String age);

    /**
     *
     * @param user x
     * @return x
     */
    @PostMapping("/hello3")
    String hello3(@RequestBody User user);


}
