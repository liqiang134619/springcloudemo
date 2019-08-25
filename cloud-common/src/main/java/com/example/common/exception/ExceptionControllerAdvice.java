package com.example.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Liq
 * @date 2019/8/25
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception exception) {
        String message = exception.getMessage();
        return "系统繁忙！ ops, " + message;
    }
}
