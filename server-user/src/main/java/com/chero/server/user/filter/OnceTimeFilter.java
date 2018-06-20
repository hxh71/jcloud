package com.chero.server.user.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by hxh on 2018/6/13.
 */
@Component
public class OnceTimeFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("once 过滤器 开始");
        long start = new Date().getTime();
        // 后续处理
        filterChain.doFilter(request, response);
        long end = new Date().getTime();
        System.out.println(request.getRemoteHost() + request.getRemoteAddr() + request.getRemoteUser());
        System.out.println(request.getAuthType() + request.getPathInfo() + request.getQueryString());
        System.out.println(request.getRequestURL().toString() + ":耗时:" + (new Date().getTime() - start));
        System.out.println("once 过滤器 结束 ");
    }
}
