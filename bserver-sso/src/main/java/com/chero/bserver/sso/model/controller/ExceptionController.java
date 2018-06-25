package com.chero.bserver.sso.model.controller;

import com.chero.common.utils.JsonUtil;
import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hxh on 2018/6/19.
 */
@RestController
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    // 能捕获service 和 controller里的异常
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY)   // 可以直接放到异常类上reason能直接改变返回的信息
    public Object handleException(Exception exception, HttpServletRequest request) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("status", 1);
        map.put("path", request.getPathInfo());
        map.put("uri", request.getRequestURI());
        map.put("url", request.getRequestURL());
        map.put("user", request.getUserPrincipal());
        map.put("message", exception.getMessage());
        map.put("content", exception.getClass().getName());
//        map.put("content", exception.getClass().getName());
        return map;
    }
    @ExceptionHandler(FeignException.class)
    // 能捕获service 和 controller里的异常
    @ResponseStatus(value = HttpStatus.BAD_GATEWAY)   // 可以直接放到异常类上reason能直接改变返回的信息
    public Object handleFeignException(Exception exception, HttpServletRequest request) {

        String message = exception.getMessage();
        String json = message.substring(message.lastIndexOf("{"));
        return JsonUtil.toObject(json, Map.class);
//        return exception.getMessage();
    }
}

