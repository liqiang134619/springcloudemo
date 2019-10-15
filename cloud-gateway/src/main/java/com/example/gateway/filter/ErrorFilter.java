package com.example.gateway.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ERROR_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SEND_ERROR_FILTER_ORDER;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

/**
 * @author Liq
 * @date 2019/10/15
 */
@Component
public class ErrorFilter extends ZuulFilter {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String filterType() {
        return ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return SEND_ERROR_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true; // 默认处理
    }

    @Override
    public Object run() {
        // 可以在此统一处理执行之前的异常
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        try {
//            Result result;
//            if (throwable instanceof ZuulException && throwable.getCause() instanceof CommonException) {
//                CommonException exception = (CommonException) throwable.getCause();
//                exception.printStackTrace();
//                result = Result.builder().error(exception.getCustomMsg()).status(exception.getExceptionCode()).service(serviceName).build();
//            } else {
//                result = Result.builder().error(throwable.getMessage()).service(serviceName).build();
//            }
//            // 正常response
            ctx.setResponseStatusCode(200);
            ctx.getResponse().setContentType("application/json;charset=UTF-8");
//            ctx.setResponseBody(JSONObject.toJSONString(result));
            ctx.setResponseBody("error");
            // 避免SendErrorFilter处理，直接进入post类型过滤器处理
//            ctx.setThrowable(null);
            ctx.remove("throwable");
        } catch (Exception var5) {
            var5.printStackTrace();
            ReflectionUtils.rethrowRuntimeException(var5);

        }
        return null;
    }

}
