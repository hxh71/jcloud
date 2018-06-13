package com.chero.server.user.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by hxh44 on 2018/6/13.
 */
@Aspect
@Component
public class TimeAspect {
    @Around("execution(* com.imooc.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("切片开始");

        Object[] args = pjp.getArgs();
        for (Object arg: args){
            System.out.println("arg is" + arg);
        }

        Object object = pjp.proceed();
        System.out.println("时间切片 耗时：" + (new Date().getTime()));
        return object;
    }
}
