package com.chero.server.mybatis.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 由dispatcherServlet调用，doService方法
 * Created by hxh44 on 2018/6/13.
 */
public class TimeInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // handler 无法拦截所需要参数
        System.out.println("拦截前");
        System.out.println("类名" + ((HandlerMethod)handler).getBean().getClass().getName());
        System.out.println("方法名" + ((HandlerMethod)handler).getMethod().getName());
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截后（无异常）");
        Long start  = (Long) request.getAttribute("startTime");
        System.out.println("拦截器耗时:" + (System.currentTimeMillis() - start));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
