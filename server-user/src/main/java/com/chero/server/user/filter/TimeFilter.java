package com.chero.server.user.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

/**
 * Created by hxh on 2018/6/13.
 */
@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("time filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("time filter start");
        long start = new Date().getTime();
        // 后续处理
        chain.doFilter(servletRequest, servletResponse);
        long end = new Date().getTime();
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println(request.getRemoteHost() + request.getRemoteAddr() + request.getRemoteUser());
        System.out.println(request.getAuthType() + request.getPathInfo() + request.getQueryString());
        System.out.println(request.getRequestURL().toString() + ":耗时:" + (new Date().getTime() - start));
        System.out.println("time filter finsh");
    }

    @Override
    public void destroy() {
        System.out.println("time filter destory");
    }
}
