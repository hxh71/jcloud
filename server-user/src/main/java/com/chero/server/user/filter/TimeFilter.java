package com.chero.server.user.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/**
 * Created by hxh on 2018/6/13.
 */

@WebFilter(urlPatterns = "/*"/*, filterName = "tFilter"*/) //可以直接在这设置规则
//@Order(value = 1)
@Slf4j
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("TimeFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        log.info("--------------------------------------");
        long start = System.currentTimeMillis();
        // 后续处理
        chain.doFilter(servletRequest, servletResponse);
        long end = System.currentTimeMillis();
        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        System.out.println(request.getRemoteHost() + request.getRemoteAddr() + request.getRemoteUser());
//        System.out.println(request.getAuthType() + request.getPathInfo() + request.getQueryString());
        log.info("ip:{},url:{},参数:{} 耗时:{}",request.getRemoteHost(), request.getRequestURL().toString(), (System.currentTimeMillis() - start));
//        log.info("请求参数:");
//        for (Map.Entry<String, String[]> m : request.getParameterMap().entrySet()) {
//            log.info("{}={}" + m.getKey(), m.getValue());
//        }
        log.info("--------------------------------------");
//        System.out.println(request.getRequestURL().toString() + ":耗时:" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        System.out.println("TimeFilter destory");
    }
}
