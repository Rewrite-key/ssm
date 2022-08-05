package com.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("异常处理");
        return new Result(20000,null,"出现异常");
    }
}
