package com.example.common.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 安全框架下的feign拦截器
 * @author Liq
 * @date 2019/9/1
 */
@Slf4j
public class FeignClientInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {

        log.info("【==>  no doubt feign拦截器执行了】");


        //使用RequestContextHolder工具获取request相关变量
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        if(attributes !=null) {
            HttpServletRequest request = attributes.getRequest();
            String header = request.getHeader("token");
            if(header !=null ) {
                requestTemplate.header("token",header);
            }
        }
    }
}
