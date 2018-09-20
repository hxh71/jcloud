package com.chero.server.mybatis.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author hxh
 * @date 2018/6/13
 */
@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("过滤器 start");
        long start = System.currentTimeMillis();
        // 后续处理
        chain.doFilter(servletRequest, servletResponse);
        long end = System.currentTimeMillis();
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("*********************************************");
        System.out.println(request.getRemoteHost() + request.getRemoteAddr() + request.getRemoteUser());
        System.out.println(request.getAuthType() + request.getPathInfo() + request.getQueryString());
        System.out.println(request.getRequestURL().toString() + ":耗时:" + (System.currentTimeMillis() - start));
        System.out.println("过滤器 finsh");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器 destory");
    }
}
